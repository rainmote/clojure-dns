(ns clojure-dns.protocol
  (:require [gloss.core :refer :all]
            [gloss.io :refer :all]
            [byte-streams :as bs]))

(def flags-frame (bit-map :qr 1
                          :opcode 4
                          :aa 1
                          :tc 1
                          :rd 1
                          :ra 1
                          :fill 3
                          :rcode 4))

(def name-frame (string :ascii :suffix 0x00))

(def query-field
  (ordered-map :name name-frame
               :type :uint16-be
               :class :uint16-be))

(def rr-name
  (let [h->b (fn [head]
               (if (= (bit-and head 0xC0) 0xC0)
                 (compile-frame [head :ubyte])
                 (compile-frame [(string :ascii :length head)
                                 name-frame]
                                #(vector (first %) (rest %))
                                #(-> % flatten vec))))
        b->h (fn [body]
               (let [e (first body)]
                 (if (string? e) (count e) e)))]
    (compile-frame (header :ubyte h->b b->h))))

(def rr-field
  (ordered-map :name rr-name
               :type :uint16
               :class :uint16
               :ttl :uint32
               :data (string :ascii :prefix :uint16)))

(def field-keys {:answer-rrs :answers
                 :authority-rrs :authoritative
                 :additional-rrs :additional})

(defn count-rss [data]
  (->> (map (fn [[count-k field-k]]
              (vector count-k (count (get data field-k))))
            field-keys)
       ;; [[:a 1] [:b 2]]
       (flatten)
       ;; (:a 1 :b 2)
       (apply assoc {})))

(defn convert-name [name]
  (let [frame (repeated (string :ascii :prefix :ubyte) :prefix :none)
        n (clojure.string/split name #"\.")]
    (bs/convert (encode frame n) String)))

(defn fn-encode [data]
  (let [f (fn [d kl]
            (let [up #(assoc-in % kl (convert-name (get-in % kl)))]
              (cond
                (nil? d) nil
                (map? d) (up d)
                (list? d) (map up d))))]
  (-> data
      (f [:query :name])
      (assoc :answers (f (:answers data) [:name]))
      (assoc :authoritative (f (:authoritative data) [:name]))
      (assoc :additional (f (:additional data) [:name]))
      (merge (count-rss data)))))

(defn fn-decode [data]
  (println data)
  data)

(def protocol
  (compile-frame
    (ordered-map :transaction-id :uint16
                 :flags flags-frame

                 ;; Automatically populate this field
                 :query-rrs :uint16
                 :answer-rrs :uint16
                 :authority-rrs :uint16
                 :additional-rrs :uint16
                 :test (string :ascii :length 15)
                 ;:query query-field
                 ;:answers (repeated rr-field :prefix :none)
                 ;:authoritative (repeated rr-field :prefix :none)
                 ;:additional (repeated rr-field :prefix :none)
                 )
    fn-encode
    fn-decode))

(def default-flags
  {:qr 0
   :opcode 0
   :aa 0
   :tc 0
   :rd 1
   :ra 0
   :fill 0
   :rcode 0})

(defn construct-request
  [& {:keys [transaction-id flags domain type class]
      :or {transaction-id (rand-int 65535)
           flags default-flags
           type 1                                           ;; A domain->ip
           class 1                                          ;; Internat
           }}]
  {:transaction-id transaction-id
   :flags flags
   :query-rrs 1
   :query {:name domain
           :type type
           :class class}})

(ns clojure-dns.core
  (:require [aleph.udp :as udp]
            [gloss.io :as io]
            [manifold.deferred :as d]
            [manifold.stream :as s]
            [byte-streams :as bs]
            [clojure-dns.protocol :as dns-pr]))

(defn wrap-duplex-stream
  [protocol s]
  (let [out (s/stream)]
    (s/connect
      (s/map #(io/encode protocol %) out)
      s)
    (s/splice
      out
      (io/decode-stream s protocol))))


(defn request
  [& {:keys [host port domains]
      :or {port 53}}]
  (let [socket @(udp/socket {})
        msg (io/encode dns-pr/protocol
                       (dns-pr/construct-request :domains domains))]
    ;(bs/print-bytes msg)
    ;(println "====================")

    (s/put! socket
            {:host host
             :port port
             :message msg})

    (-> (d/timeout! @(s/take! socket) 1000)
        :message
        ;(bs/convert java.nio.ByteBuffer)
        ;(bs/print-bytes)
        ;((partial io/decode dns-pr/protocol))
        )
    ))



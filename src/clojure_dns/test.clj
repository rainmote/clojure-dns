(ns clojure-dns.test)

Starting nREPL server...
/Library/Java/JavaVirtualMachines/jdk1.8.0_60.jdk/Contents/Home/bin/java -Dfile.encoding=UTF-8 -XX:-OmitStackTraceInFastThrow -Dclojure.compile.path=/Users/lianshitw/Desktop/Clojure/clojure-dns/target/classes -Dclojure-dns.version=0.1.0-SNAPSHOT -Dclojure.debug=false -classpath /Users/lianshitw/Desktop/Clojure/clojure-dns/test:/Users/lianshitw/Desktop/Clojure/clojure-dns/src:/Users/lianshitw/Desktop/Clojure/clojure-dns/dev-resources:/Users/lianshitw/Desktop/Clojure/clojure-dns/resources:/Users/lianshitw/Desktop/Clojure/clojure-dns/target/classes:/Users/lianshitw/.m2/repository/io/netty/netty-all/4.1.11.Final/netty-all-4.1.11.Final.jar:/Users/lianshitw/.m2/repository/com/taoensso/tufte/2.0.0/tufte-2.0.0.jar:/Users/lianshitw/.m2/repository/gloss/gloss/0.2.6/gloss-0.2.6.jar:/Users/lianshitw/.m2/repository/com/taoensso/truss/1.5.0/truss-1.5.0.jar:/Users/lianshitw/.m2/repository/io/aleph/dirigiste/0.1.3/dirigiste-0.1.3.jar:/Users/lianshitw/.m2/repository/org/clojure/tools.nrepl/0.2.12/tools.nrepl-0.2.12.jar:/Users/lianshitw/.m2/repository/clojure-complete/clojure-complete/0.2.4/clojure-complete-0.2.4.jar:/Users/lianshitw/.m2/repository/potemkin/potemkin/0.4.3/potemkin-0.4.3.jar:/Users/lianshitw/.m2/repository/org/clojure/clojure/1.9.0/clojure-1.9.0.jar:/Users/lianshitw/.m2/repository/primitive-math/primitive-math/0.1.6/primitive-math-0.1.6.jar:/Users/lianshitw/.m2/repository/manifold/manifold/0.1.3/manifold-0.1.3.jar:/Users/lianshitw/.m2/repository/clj-tuple/clj-tuple/0.2.2/clj-tuple-0.2.2.jar:/Users/lianshitw/.m2/repository/aleph/aleph/0.4.4/aleph-0.4.4.jar:/Users/lianshitw/.m2/repository/com/taoensso/encore/2.94.0/encore-2.94.0.jar:/Users/lianshitw/.m2/repository/org/clojure/core.specs.alpha/0.1.24/core.specs.alpha-0.1.24.jar:/Users/lianshitw/.m2/repository/org/clojure/tools.logging/0.3.1/tools.logging-0.3.1.jar:/Users/lianshitw/.m2/repository/riddley/riddley/0.1.12/riddley-0.1.12.jar:/Users/lianshitw/.m2/repository/byte-streams/byte-streams/0.2.4/byte-streams-0.2.4.jar:/Users/lianshitw/.m2/repository/org/clojure/tools.reader/1.2.1/tools.reader-1.2.1.jar:/Users/lianshitw/.m2/repository/org/clojure/spec.alpha/0.1.143/spec.alpha-0.1.143.jar clojure.main -i /private/var/folders/v3/1lq5jrfn02z6k3__3mx1cvxc0000gn/T/form-init7927899618414340667.clj
Connecting to local nREPL server...
Clojure 1.9.0
nREPL server started on port 55585 on host 127.0.0.1 - nrepl://127.0.0.1:55585
Loading src/clojure_dns/core.clj... done
(use 'clojure-dns.core)
=> nil
(request :host "114.114.114.114"
         :domains ["www.baidu.com"])
{}
manifold.stream.SplicedStream
=> true
Loading src/clojure_dns/core.clj... done
(request :host "114.114.114.114"
         :domains ["www.baidu.com"])
{}
manifold.stream.SplicedStream
=>
{:sender #object[java.net.InetSocketAddress 0x59c59f88 "/114.114.114.114:53"],
 :message #object["[B" 0x7b8be35c "[B@7b8be35c"]}
Loading src/clojure_dns/core.clj... done
(request :host "114.114.114.114"
         :domains ["www.baidu.com"])
{}
manifold.stream.SplicedStream
IllegalArgumentException Don't know how to convert class gloss.core.structure$compile_frame$reify__8117 into (seq-of java.nio.ByteBuffer)  byte-streams/convert (byte_streams.clj:196)
Loading src/clojure_dns/core.clj... done
(request :host "114.114.114.114"
         :domains ["www.baidu.com"])
{}
manifold.stream.SplicedStream
=> #object["[B" 0x19a64a0a "[B@19a64a0a"]
Loading src/clojure_dns/core.clj... done
(request :host "114.114.114.114"
         :domains ["www.baidu.com"])
{}
manifold.stream.SplicedStream
MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
Loading src/clojure_dns/protocol.clj... done
Loading src/clojure_dns/core.clj... done
(request :host "114.114.114.114"
         :domains ["www.baidu.com"])
{}
MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
Loading src/clojure_dns/core.clj... done
(request :host "114.114.114.114"
         :domains ["www.baidu.com"])
MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
Loading src/clojure_dns/core.clj... done
(request :host "114.114.114.114"
         :domains ["www.baidu.com"])
=> [B
    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    => #object["[B" 0x4a850de2 "[B@4a850de2"]
    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    => #object[java.nio.HeapByteBuffer 0x77c8fc59 "java.nio.HeapByteBuffer[pos=0 lim=260 cap=260]"]
    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
    Loading src/clojure_dns/core.clj... done
    Loading src/clojure_dns/core.clj... done
    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    IllegalArgumentException cannot convert clojure_dns.core$request$fn__8809 to source  manifold.stream/->source (stream.clj:86)
    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    Sep 01, 2018 8:44:19 PM clojure.tools.logging$eval570$fn__574 invoke
    严重: error in manifold.utils/future-with
    java.lang.AbstractMethodError: Method aleph/udp/UdpPacket.hasNext()Z is abstract
    at aleph.udp.UdpPacket.hasNext(udp.clj)
    at manifold.stream.iterator.IteratorSource.take(iterator.clj:34)
    at manifold.stream.graph$sync_connect$f__2917__auto____4020.invoke(graph.clj:227)
    at clojure.lang.AFn.run(AFn.java:22)
    at io.aleph.dirigiste.Executor$3.run(Executor.java:308)
    at io.aleph.dirigiste.Executor$Worker$1.run(Executor.java:62)
    at manifold.executor$thread_factory$reify__2799$f__2800.invoke(executor.clj:36)
    at clojure.lang.AFn.run(AFn.java:22)
    at java.lang.Thread.run(Thread.java:745)

    Loading src/clojure_dns/core.clj... Error evaluating - class java.lang.InterruptedException:

    Process finished with exit code 137 (interrupted by signal 9: SIGKILL)


    Starting nREPL server...
    /Library/Java/JavaVirtualMachines/jdk1.8.0_60.jdk/Contents/Home/bin/java -Dfile.encoding=UTF-8 -XX:-OmitStackTraceInFastThrow -Dclojure.compile.path=/Users/lianshitw/Desktop/Clojure/clojure-dns/target/classes -Dclojure-dns.version=0.1.0-SNAPSHOT -Dclojure.debug=false -classpath /Users/lianshitw/Desktop/Clojure/clojure-dns/test:/Users/lianshitw/Desktop/Clojure/clojure-dns/src:/Users/lianshitw/Desktop/Clojure/clojure-dns/dev-resources:/Users/lianshitw/Desktop/Clojure/clojure-dns/resources:/Users/lianshitw/Desktop/Clojure/clojure-dns/target/classes:/Users/lianshitw/.m2/repository/io/netty/netty-all/4.1.11.Final/netty-all-4.1.11.Final.jar:/Users/lianshitw/.m2/repository/com/taoensso/tufte/2.0.0/tufte-2.0.0.jar:/Users/lianshitw/.m2/repository/gloss/gloss/0.2.6/gloss-0.2.6.jar:/Users/lianshitw/.m2/repository/com/taoensso/truss/1.5.0/truss-1.5.0.jar:/Users/lianshitw/.m2/repository/io/aleph/dirigiste/0.1.3/dirigiste-0.1.3.jar:/Users/lianshitw/.m2/repository/org/clojure/tools.nrepl/0.2.12/tools.nrepl-0.2.12.jar:/Users/lianshitw/.m2/repository/clojure-complete/clojure-complete/0.2.4/clojure-complete-0.2.4.jar:/Users/lianshitw/.m2/repository/potemkin/potemkin/0.4.3/potemkin-0.4.3.jar:/Users/lianshitw/.m2/repository/org/clojure/clojure/1.9.0/clojure-1.9.0.jar:/Users/lianshitw/.m2/repository/primitive-math/primitive-math/0.1.6/primitive-math-0.1.6.jar:/Users/lianshitw/.m2/repository/manifold/manifold/0.1.3/manifold-0.1.3.jar:/Users/lianshitw/.m2/repository/clj-tuple/clj-tuple/0.2.2/clj-tuple-0.2.2.jar:/Users/lianshitw/.m2/repository/aleph/aleph/0.4.4/aleph-0.4.4.jar:/Users/lianshitw/.m2/repository/com/taoensso/encore/2.94.0/encore-2.94.0.jar:/Users/lianshitw/.m2/repository/org/clojure/core.specs.alpha/0.1.24/core.specs.alpha-0.1.24.jar:/Users/lianshitw/.m2/repository/org/clojure/tools.logging/0.3.1/tools.logging-0.3.1.jar:/Users/lianshitw/.m2/repository/riddley/riddley/0.1.12/riddley-0.1.12.jar:/Users/lianshitw/.m2/repository/byte-streams/byte-streams/0.2.4/byte-streams-0.2.4.jar:/Users/lianshitw/.m2/repository/org/clojure/tools.reader/1.2.1/tools.reader-1.2.1.jar:/Users/lianshitw/.m2/repository/org/clojure/spec.alpha/0.1.143/spec.alpha-0.1.143.jar clojure.main -i /private/var/folders/v3/1lq5jrfn02z6k3__3mx1cvxc0000gn/T/form-init7657307108987150282.clj
    Connecting to local nREPL server...
    Clojure 1.9.0
    nREPL server started on port 56109 on host 127.0.0.1 - nrepl://127.0.0.1:56109
    Loading src/clojure_dns/core.clj... done
    (use 'clojure-dns.core)
    => nil
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    ClassCastException manifold.deferred.Deferred cannot be cast to manifold.stream.core.IEventSink  clojure-dns.core/request (core.clj:23)
    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    ClassCastException manifold.deferred.SuccessDeferred cannot be cast to manifold.stream.core.IEventSink  clojure-dns.core/request (core.clj:23)
    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    Sep 01, 2018 8:57:21 PM clojure.tools.logging$eval570$fn__574 invoke
    严重: error in stream handler
    java.lang.NullPointerException
    at clojure.lang.RT.intCast(RT.java:1213)
    at gloss.data.primitives$ushort__GT_short.invokeStatic(primitives.clj:59)
    at gloss.data.primitives$ushort__GT_short.invoke(primitives.clj:57)
    at gloss.data.primitives$reify__7795.write_bytes(primitives.clj:147)
    at gloss.core.structure$convert_sequence$reify__8054$fn__8088.invoke(structure.clj:68)
    at clojure.core$map$fn__5587.invoke(core.clj:2747)
    at clojure.lang.LazySeq.sval(LazySeq.java:40)
    at clojure.lang.LazySeq.seq(LazySeq.java:49)
    at clojure.lang.RT.seq(RT.java:528)
    at clojure.core$seq__5124.invokeStatic(core.clj:137)
    at clojure.core$apply.invokeStatic(core.clj:652)
    at clojure.core$apply.invoke(core.clj:652)
    at gloss.core.structure$convert_sequence$reify__8054.write_bytes(structure.clj:66)
    at gloss.core.codecs$ordered_map$reify__8184.write_bytes(codecs.clj:233)
    at gloss.core.structure$compile_frame$reify__8111.write_bytes(structure.clj:125)
    at gloss.io$encode.invokeStatic(io.clj:44)
    at gloss.io$encode.invoke(io.clj:40)
    at clojure_dns.core$wrap_duplex_stream$fn__8490.invoke(core.clj:13)
    at manifold.stream$map$fn__4646.invoke(stream.clj:580)
    at manifold.stream.Callback.put(stream.clj:453)
    at manifold.stream.graph$async_send.invokeStatic(graph.clj:50)
    at manifold.stream.graph$async_send.invoke(graph.clj:46)
    at manifold.stream.graph$async_connect$this__3999.invoke(graph.clj:181)
    at manifold.stream.graph$async_connect$this__3999$fn__4000$fn__4001.invoke(graph.clj:162)
    at clojure.core$trampoline.invokeStatic(core.clj:6230)
    at clojure.core$trampoline.invoke(core.clj:6219)
    at manifold.stream.graph$async_connect$this__3999$fn__4000.invoke(graph.clj:162)
    at manifold.deferred.Listener.onSuccess(deferred.clj:219)
    at manifold.deferred.Deferred$fn__3402.invoke(deferred.clj:398)
    at manifold.deferred.Deferred.success(deferred.clj:398)
    at manifold.deferred$success_BANG_.invokeStatic(deferred.clj:245)
    at manifold.deferred$success_BANG_.invoke(deferred.clj:240)
    at manifold.stream.default.Stream.put(default.clj:119)
    at manifold.stream.default.Stream.put(default.clj:141)
    at manifold.stream.SplicedStream.put(stream.clj:404)
    at clojure_dns.core$request.invokeStatic(core.clj:25)
    at clojure_dns.core$request.doInvoke(core.clj:20)
    at clojure.lang.RestFn.invoke(RestFn.java:457)
    at user$eval8501.invokeStatic(form-init7657307108987150282.clj:1)
    at user$eval8501.invoke(form-init7657307108987150282.clj:1)
    at clojure.lang.Compiler.eval(Compiler.java:7062)
    at clojure.lang.Compiler.eval(Compiler.java:7025)
    at clojure.core$eval.invokeStatic(core.clj:3206)
    at clojure.core$eval.invoke(core.clj:3202)
    at clojure.main$repl$read_eval_print__8572$fn__8575.invoke(main.clj:243)
    at clojure.main$repl$read_eval_print__8572.invoke(main.clj:243)
    at clojure.main$repl$fn__8581.invoke(main.clj:261)
    at clojure.main$repl.invokeStatic(main.clj:261)
    at clojure.main$repl.doInvoke(main.clj:177)
    at clojure.lang.RestFn.invoke(RestFn.java:1523)
    at clojure.tools.nrepl.middleware.interruptible_eval$evaluate$fn__1117.invoke(interruptible_eval.clj:87)
    at clojure.lang.AFn.applyToHelper(AFn.java:152)
    at clojure.lang.AFn.applyTo(AFn.java:144)
    at clojure.core$apply.invokeStatic(core.clj:657)
    at clojure.core$with_bindings_STAR_.invokeStatic(core.clj:1965)
    at clojure.core$with_bindings_STAR_.doInvoke(core.clj:1965)
    at clojure.lang.RestFn.invoke(RestFn.java:425)
    at clojure.tools.nrepl.middleware.interruptible_eval$evaluate.invokeStatic(interruptible_eval.clj:85)
    at clojure.tools.nrepl.middleware.interruptible_eval$evaluate.invoke(interruptible_eval.clj:55)
    at clojure.tools.nrepl.middleware.interruptible_eval$interruptible_eval$fn__1162$fn__1165.invoke(interruptible_eval.clj:222)
    at clojure.tools.nrepl.middleware.interruptible_eval$run_next$fn__1157.invoke(interruptible_eval.clj:190)
    at clojure.lang.AFn.run(AFn.java:22)
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
    at java.lang.Thread.run(Thread.java:745)

    => nil
    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    ClassCastException manifold.deferred.Deferred cannot be cast to manifold.stream.core.IEventSink  clojure-dns.core/request (core.clj:23)
    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    ClassCastException manifold.deferred.SuccessDeferred cannot be cast to manifold.stream.core.IEventSink  clojure-dns.core/request (core.clj:23)
    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    Sep 02, 2018 5:38:48 PM clojure.tools.logging$eval570$fn__574 invoke
    严重: error in stream handler
    java.lang.NullPointerException
    at clojure.lang.RT.intCast(RT.java:1213)
    at gloss.data.primitives$ushort__GT_short.invokeStatic(primitives.clj:59)
    at gloss.data.primitives$ushort__GT_short.invoke(primitives.clj:57)
    at gloss.data.primitives$reify__7795.write_bytes(primitives.clj:147)
    at gloss.core.structure$convert_sequence$reify__8054$fn__8088.invoke(structure.clj:68)
    at clojure.core$map$fn__5587.invoke(core.clj:2747)
    at clojure.lang.LazySeq.sval(LazySeq.java:40)
    at clojure.lang.LazySeq.seq(LazySeq.java:49)
    at clojure.lang.RT.seq(RT.java:528)
    at clojure.core$seq__5124.invokeStatic(core.clj:137)
    at clojure.core$apply.invokeStatic(core.clj:652)
    at clojure.core$apply.invoke(core.clj:652)
    at gloss.core.structure$convert_sequence$reify__8054.write_bytes(structure.clj:66)
    at gloss.core.codecs$ordered_map$reify__8184.write_bytes(codecs.clj:233)
    at gloss.core.structure$compile_frame$reify__8111.write_bytes(structure.clj:125)
    at gloss.io$encode.invokeStatic(io.clj:44)
    at gloss.io$encode.invoke(io.clj:40)
    at clojure_dns.core$wrap_duplex_stream$fn__8577.invoke(core.clj:13)
    at manifold.stream$map$fn__4646.invoke(stream.clj:580)
    at manifold.stream.Callback.put(stream.clj:453)
    at manifold.stream.graph$async_send.invokeStatic(graph.clj:50)
    at manifold.stream.graph$async_send.invoke(graph.clj:46)
    at manifold.stream.graph$async_connect$this__3999.invoke(graph.clj:181)
    at manifold.stream.graph$async_connect$this__3999$fn__4000$fn__4001.invoke(graph.clj:162)
    at clojure.core$trampoline.invokeStatic(core.clj:6230)
    at clojure.core$trampoline.invoke(core.clj:6219)
    at manifold.stream.graph$async_connect$this__3999$fn__4000.invoke(graph.clj:162)
    at manifold.deferred.Listener.onSuccess(deferred.clj:219)
    at manifold.deferred.Deferred$fn__3402.invoke(deferred.clj:398)
    at manifold.deferred.Deferred.success(deferred.clj:398)
    at manifold.deferred$success_BANG_.invokeStatic(deferred.clj:245)
    at manifold.deferred$success_BANG_.invoke(deferred.clj:240)
    at manifold.stream.default.Stream.put(default.clj:119)
    at manifold.stream.default.Stream.put(default.clj:141)
    at manifold.stream.SplicedStream.put(stream.clj:404)
    at clojure_dns.core$request.invokeStatic(core.clj:25)
    at clojure_dns.core$request.doInvoke(core.clj:20)
    at clojure.lang.RestFn.invoke(RestFn.java:457)
    at user$eval8588.invokeStatic(form-init7657307108987150282.clj:1)
    at user$eval8588.invoke(form-init7657307108987150282.clj:1)
    at clojure.lang.Compiler.eval(Compiler.java:7062)
    at clojure.lang.Compiler.eval(Compiler.java:7025)
    at clojure.core$eval.invokeStatic(core.clj:3206)
    at clojure.core$eval.invoke(core.clj:3202)
    at clojure.main$repl$read_eval_print__8572$fn__8575.invoke(main.clj:243)
    at clojure.main$repl$read_eval_print__8572.invoke(main.clj:243)
    at clojure.main$repl$fn__8581.invoke(main.clj:261)
    at clojure.main$repl.invokeStatic(main.clj:261)
    at clojure.main$repl.doInvoke(main.clj:177)
    at clojure.lang.RestFn.invoke(RestFn.java:1523)
    at clojure.tools.nrepl.middleware.interruptible_eval$evaluate$fn__1117.invoke(interruptible_eval.clj:87)
    at clojure.lang.AFn.applyToHelper(AFn.java:152)
    at clojure.lang.AFn.applyTo(AFn.java:144)
    at clojure.core$apply.invokeStatic(core.clj:657)
    at clojure.core$with_bindings_STAR_.invokeStatic(core.clj:1965)
    at clojure.core$with_bindings_STAR_.doInvoke(core.clj:1965)
    at clojure.lang.RestFn.invoke(RestFn.java:425)
    => 	at clojure.tools.nrepl.middleware.interruptible_eval$evaluate.invokeStatic(interruptible_eval.clj:85)
    << true >>
    at clojure.tools.nrepl.middleware.interruptible_eval$evaluate.invoke(interruptible_eval.clj:55)
    at clojure.tools.nrepl.middleware.interruptible_eval$interruptible_eval$fn__1162$fn__1165.invoke(interruptible_eval.clj:222)
    at clojure.tools.nrepl.middleware.interruptible_eval$run_next$fn__1157.invoke(interruptible_eval.clj:190)
    at clojure.lang.AFn.run(AFn.java:22)
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
    at java.lang.Thread.run(Thread.java:745)

    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    Sep 02, 2018 5:39:09 PM clojure.tools.logging$eval570$fn__574 invoke
    严重: error in stream handler
    java.lang.NullPointerException
    at clojure.lang.RT.intCast(RT.java:1213)
    at gloss.data.primitives$ushort__GT_short.invokeStatic(primitives.clj:59)
    at gloss.data.primitives$ushort__GT_short.invoke(primitives.clj:57)
    at gloss.data.primitives$reify__7795.write_bytes(primitives.clj:147)
    at gloss.core.structure$convert_sequence$reify__8054$fn__8088.invoke(structure.clj:68)
    at clojure.core$map$fn__5587.invoke(core.clj:2747)
    at clojure.lang.LazySeq.sval(LazySeq.java:40)
    at clojure.lang.LazySeq.seq(LazySeq.java:49)
    at clojure.lang.RT.seq(RT.java:528)
    at clojure.core$seq__5124.invokeStatic(core.clj:137)
    at clojure.core$apply.invokeStatic(core.clj:652)
    at clojure.core$apply.invoke(core.clj:652)
    at gloss.core.structure$convert_sequence$reify__8054.write_bytes(structure.clj:66)
    at gloss.core.codecs$ordered_map$reify__8184.write_bytes(codecs.clj:233)
    at gloss.core.structure$compile_frame$reify__8111.write_bytes(structure.clj:125)
    at gloss.io$encode.invokeStatic(io.clj:44)
    at gloss.io$encode.invoke(io.clj:40)
    at clojure_dns.core$wrap_duplex_stream$fn__8606.invoke(core.clj:13)
    at manifold.stream$map$fn__4646.invoke(stream.clj:580)
    at manifold.stream.Callback.put(stream.clj:453)
    at manifold.stream.graph$async_send.invokeStatic(graph.clj:50)
    at manifold.stream.graph$async_send.invoke(graph.clj:46)
    at manifold.stream.graph$async_connect$this__3999.invoke(graph.clj:181)
    at manifold.stream.graph$async_connect$this__3999$fn__4000$fn__4001.invoke(graph.clj:162)
    at clojure.core$trampoline.invokeStatic(core.clj:6230)
    at clojure.core$trampoline.invoke(core.clj:6219)
    at manifold.stream.graph$async_connect$this__3999$fn__4000.invoke(graph.clj:162)
    at manifold.deferred.Listener.onSuccess(deferred.clj:219)
    at manifold.deferred.Deferred$fn__3402.invoke(deferred.clj:398)
    at manifold.deferred.Deferred.success(deferred.clj:398)
    at manifold.deferred$success_BANG_.invokeStatic(deferred.clj:245)
    at manifold.deferred$success_BANG_.invoke(deferred.clj:240)
    at manifold.stream.default.Stream.put(default.clj:119)
    at manifold.stream.default.Stream.put(default.clj:141)
    at manifold.stream.SplicedStream.put(stream.clj:404)
    at clojure_dns.core$request.invokeStatic(core.clj:25)
    at clojure_dns.core$request.doInvoke(core.clj:20)
    at clojure.lang.RestFn.invoke(RestFn.java:457)
    at user$eval8617.invokeStatic(form-init7657307108987150282.clj:1)
    at user$eval8617.invoke(form-init7657307108987150282.clj:1)
    at clojure.lang.Compiler.eval(Compiler.java:7062)
    at clojure.lang.Compiler.eval(Compiler.java:7025)
    at clojure.core$eval.invokeStatic(core.clj:3206)
    at clojure.core$eval.invoke(core.clj:3202)
    at clojure.main$repl$read_eval_print__8572$fn__8575.invoke(main.clj:243)
    at clojure.main$repl$read_eval_print__8572.invoke(main.clj:243)
    at clojure.main$repl$fn__8581.invoke(main.clj:261)
    at clojure.main$repl.invokeStatic(main.clj:261)
    at clojure.main$repl.doInvoke(main.clj:177)
    at clojure.lang.RestFn.invoke(RestFn.java:1523)
    at clojure.tools.nrepl.middleware.interruptible_eval$evaluate$fn__1117.invoke(interruptible_eval.clj:87)
    at clojure.lang.AFn.applyToHelper(AFn.java:152)
    at clojure.lang.AFn.applyTo(AFn.java:144)
    at clojure.core$apply.invokeStatic(core.clj:657)
    at clojure.core$with_bindings_STAR_.invokeStatic(core.clj:1965)
    at clojure.core$with_bindings_STAR_.doInvoke(core.clj:1965)
    at clojure.lang.RestFn.invoke(RestFn.java:425)
    at clojure.tools.nrepl.middleware.interruptible_eval$evaluate.invokeStatic(interruptible_eval.clj:85)
    at clojure.tools.nrepl.middleware.interruptible_eval$evaluate.invoke(interruptible_eval.clj:55)
    at clojure.tools.nrepl.middleware.interruptible_eval$interruptible_eval$fn__1162$fn__1165.invoke(interruptible_eval.clj:222)
    at clojure.tools.nrepl.middleware.interruptible_eval$run_next$fn__1157.invoke(interruptible_eval.clj:190)
    at clojure.lang.AFn.run(AFn.java:22)
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
    at java.lang.Thread.run(Thread.java:745)

    => << true >>
    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    Sep 02, 2018 5:39:14 PM clojure.tools.logging$eval570$fn__574 invoke
    严重: error in stream handler
    java.lang.NullPointerException
    at clojure.lang.RT.intCast(RT.java:1213)
    at gloss.data.primitives$ushort__GT_short.invokeStatic(primitives.clj:59)
    at gloss.data.primitives$ushort__GT_short.invoke(primitives.clj:57)
    at gloss.data.primitives$reify__7795.write_bytes(primitives.clj:147)
    at gloss.core.structure$convert_sequence$reify__8054$fn__8088.invoke(structure.clj:68)
    at clojure.core$map$fn__5587.invoke(core.clj:2747)
    at clojure.lang.LazySeq.sval(LazySeq.java:40)
    at clojure.lang.LazySeq.seq(LazySeq.java:49)
    at clojure.lang.RT.seq(RT.java:528)
    at clojure.core$seq__5124.invokeStatic(core.clj:137)
    at clojure.core$apply.invokeStatic(core.clj:652)
    at clojure.core$apply.invoke(core.clj:652)
    at gloss.core.structure$convert_sequence$reify__8054.write_bytes(structure.clj:66)
    at gloss.core.codecs$ordered_map$reify__8184.write_bytes(codecs.clj:233)
    at gloss.core.structure$compile_frame$reify__8111.write_bytes(structure.clj:125)
    at gloss.io$encode.invokeStatic(io.clj:44)
    at gloss.io$encode.invoke(io.clj:40)
    at clojure_dns.core$wrap_duplex_stream$fn__8635.invoke(core.clj:13)
    at manifold.stream$map$fn__4646.invoke(stream.clj:580)
    at manifold.stream.Callback.put(stream.clj:453)
    at manifold.stream.graph$async_send.invokeStatic(graph.clj:50)
    at manifold.stream.graph$async_send.invoke(graph.clj:46)
    at manifold.stream.graph$async_connect$this__3999.invoke(graph.clj:181)
    at manifold.stream.graph$async_connect$this__3999$fn__4000$fn__4001.invoke(graph.clj:162)
    at clojure.core$trampoline.invokeStatic(core.clj:6230)
    at clojure.core$trampoline.invoke(core.clj:6219)
    at manifold.stream.graph$async_connect$this__3999$fn__4000.invoke(graph.clj:162)
    at manifold.deferred.Listener.onSuccess(deferred.clj:219)
    at manifold.deferred.Deferred$fn__3402.invoke(deferred.clj:398)
    at manifold.deferred.Deferred.success(deferred.clj:398)
    at manifold.deferred$success_BANG_.invokeStatic(deferred.clj:245)
    at manifold.deferred$success_BANG_.invoke(deferred.clj:240)
    at manifold.stream.default.Stream.put(default.clj:119)
    => << true >>
    at manifold.stream.default.Stream.put(default.clj:141)
    at manifold.stream.SplicedStream.put(stream.clj:404)
    at clojure_dns.core$request.invokeStatic(core.clj:25)
    at clojure_dns.core$request.doInvoke(core.clj:20)
    at clojure.lang.RestFn.invoke(RestFn.java:457)
    at user$eval8646.invokeStatic(form-init7657307108987150282.clj:1)
    at user$eval8646.invoke(form-init7657307108987150282.clj:1)
    at clojure.lang.Compiler.eval(Compiler.java:7062)
    at clojure.lang.Compiler.eval(Compiler.java:7025)
    at clojure.core$eval.invokeStatic(core.clj:3206)
    at clojure.core$eval.invoke(core.clj:3202)
    at clojure.main$repl$read_eval_print__8572$fn__8575.invoke(main.clj:243)
    at clojure.main$repl$read_eval_print__8572.invoke(main.clj:243)
    at clojure.main$repl$fn__8581.invoke(main.clj:261)
    at clojure.main$repl.invokeStatic(main.clj:261)
    at clojure.main$repl.doInvoke(main.clj:177)
    at clojure.lang.RestFn.invoke(RestFn.java:1523)
    at clojure.tools.nrepl.middleware.interruptible_eval$evaluate$fn__1117.invoke(interruptible_eval.clj:87)
    at clojure.lang.AFn.applyToHelper(AFn.java:152)
    at clojure.lang.AFn.applyTo(AFn.java:144)
    at clojure.core$apply.invokeStatic(core.clj:657)
    at clojure.core$with_bindings_STAR_.invokeStatic(core.clj:1965)
    at clojure.core$with_bindings_STAR_.doInvoke(core.clj:1965)
    at clojure.lang.RestFn.invoke(RestFn.java:425)
    at clojure.tools.nrepl.middleware.interruptible_eval$evaluate.invokeStatic(interruptible_eval.clj:85)
    at clojure.tools.nrepl.middleware.interruptible_eval$evaluate.invoke(interruptible_eval.clj:55)
    at clojure.tools.nrepl.middleware.interruptible_eval$interruptible_eval$fn__1162$fn__1165.invoke(interruptible_eval.clj:222)
    at clojure.tools.nrepl.middleware.interruptible_eval$run_next$fn__1157.invoke(interruptible_eval.clj:190)
    at clojure.lang.AFn.run(AFn.java:22)
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
    at java.lang.Thread.run(Thread.java:745)

    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    => << … >>
    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    => true
    Loading src/clojure_dns/core.clj... done
    (request :host "114.114.114.114"
             :domains ["www.baidu.com"])
    => #object["[B" 0xbd45ff8 "[B@bd45ff8"]
    (def a (request :host "114.114.114.114"
                    :domains ["www.baidu.com"]))
    => #'user/a
    (type a)
    => [B
        (require 'byte-streams)
        => nil
        (byte-streams/convert a java.nio.ByteBuffer)
        => #object[java.nio.HeapByteBuffer 0x7b7e3f45 "java.nio.HeapByteBuffer[pos=0 lim=90 cap=90]"]
        Loading src/clojure_dns/core.clj... done
        (def a (request :host "114.114.114.114"
                        :domains ["www.baidu.com"]))
        CompilerException java.lang.IllegalArgumentException: Don't know how to convert class clojure_dns.core$request$fn__8762 into (seq-of java.nio.ByteBuffer), compiling:(form-init7657307108987150282.clj:1:8)
        Loading src/clojure_dns/core.clj... done
        (def a (request :host "114.114.114.114"
                        :domains ["www.baidu.com"]))
        => #'user/a
        (request :host "114.114.114.114"
                 :domains ["www.baidu.com" "www.google.com"])
        => #object[clojure_dns.core$request$fn__8789 0x279b8db "clojure_dns.core$request$fn__8789@279b8db"]
        Loading src/clojure_dns/core.clj... done
        (request :host "114.114.114.114"
                 :domains ["www.baidu.com" "www.google.com"])

        Process finished with exit code 137 (interrupted by signal 9: SIGKILL)


        Starting nREPL server...
        /Library/Java/JavaVirtualMachines/jdk1.8.0_60.jdk/Contents/Home/bin/java -Dfile.encoding=UTF-8 -XX:-OmitStackTraceInFastThrow -Dclojure.compile.path=/Users/lianshitw/Desktop/Clojure/clojure-dns/target/classes -Dclojure-dns.version=0.1.0-SNAPSHOT -Dclojure.debug=false -classpath /Users/lianshitw/Desktop/Clojure/clojure-dns/test:/Users/lianshitw/Desktop/Clojure/clojure-dns/src:/Users/lianshitw/Desktop/Clojure/clojure-dns/dev-resources:/Users/lianshitw/Desktop/Clojure/clojure-dns/resources:/Users/lianshitw/Desktop/Clojure/clojure-dns/target/classes:/Users/lianshitw/.m2/repository/io/netty/netty-all/4.1.11.Final/netty-all-4.1.11.Final.jar:/Users/lianshitw/.m2/repository/com/taoensso/tufte/2.0.0/tufte-2.0.0.jar:/Users/lianshitw/.m2/repository/gloss/gloss/0.2.6/gloss-0.2.6.jar:/Users/lianshitw/.m2/repository/com/taoensso/truss/1.5.0/truss-1.5.0.jar:/Users/lianshitw/.m2/repository/io/aleph/dirigiste/0.1.3/dirigiste-0.1.3.jar:/Users/lianshitw/.m2/repository/org/clojure/tools.nrepl/0.2.12/tools.nrepl-0.2.12.jar:/Users/lianshitw/.m2/repository/clojure-complete/clojure-complete/0.2.4/clojure-complete-0.2.4.jar:/Users/lianshitw/.m2/repository/potemkin/potemkin/0.4.3/potemkin-0.4.3.jar:/Users/lianshitw/.m2/repository/org/clojure/clojure/1.9.0/clojure-1.9.0.jar:/Users/lianshitw/.m2/repository/primitive-math/primitive-math/0.1.6/primitive-math-0.1.6.jar:/Users/lianshitw/.m2/repository/manifold/manifold/0.1.3/manifold-0.1.3.jar:/Users/lianshitw/.m2/repository/clj-tuple/clj-tuple/0.2.2/clj-tuple-0.2.2.jar:/Users/lianshitw/.m2/repository/aleph/aleph/0.4.4/aleph-0.4.4.jar:/Users/lianshitw/.m2/repository/com/taoensso/encore/2.94.0/encore-2.94.0.jar:/Users/lianshitw/.m2/repository/org/clojure/core.specs.alpha/0.1.24/core.specs.alpha-0.1.24.jar:/Users/lianshitw/.m2/repository/org/clojure/tools.logging/0.3.1/tools.logging-0.3.1.jar:/Users/lianshitw/.m2/repository/riddley/riddley/0.1.12/riddley-0.1.12.jar:/Users/lianshitw/.m2/repository/byte-streams/byte-streams/0.2.4/byte-streams-0.2.4.jar:/Users/lianshitw/.m2/repository/org/clojure/tools.reader/1.2.1/tools.reader-1.2.1.jar:/Users/lianshitw/.m2/repository/org/clojure/spec.alpha/0.1.143/spec.alpha-0.1.143.jar clojure.main -i /private/var/folders/v3/1lq5jrfn02z6k3__3mx1cvxc0000gn/T/form-init638389922421654223.clj
        Connecting to local nREPL server...
        Clojure 1.9.0
        nREPL server started on port 55340 on host 127.0.0.1 - nrepl://127.0.0.1:55340
        Loading src/clojure_dns/core.clj... done
        (use 'clojure-dns.core)
        => nil
        (request :host "114.114.114.114"
                 :domains ["www.baidu.com" "www.google.com"])
        Evaluation interrupted.
        Loading src/clojure_dns/core.clj... done
        (request :host "1.1.1.1"
                 :domains ["www.baidu.com"])
        ArityException Wrong number of args (1) passed to: deferred/timeout!  clojure.lang.AFn.throwArity (AFn.java:429)
        Loading src/clojure_dns/core.clj... done
        (request :host "1.1.1.1"
                 :domains ["www.baidu.com"])
        => nil
        Loading src/clojure_dns/core.clj... done
        (request :host "1.1.1.1"
                 :domains ["www.baidu.com"])
        => #object["[B" 0x161c965b "[B@161c965b"]
        Loading src/clojure_dns/core.clj... done
        (request :host "1.1.1.1"
                 :domains ["www.baidu.com"])
        => #object[clojure_dns.core$request$fn__8544 0x30e95ecf "clojure_dns.core$request$fn__8544@30e95ecf"]
        Loading src/clojure_dns/core.clj...
        CompilerException java.lang.RuntimeException: Unable to resolve symbol: % in this context, compiling:(/Users/lianshitw/Desktop/Clojure/clojure-dns/src/clojure_dns/core.clj:32:10)

        Loading src/clojure_dns/core.clj... done
        (request :host "1.1.1.1"
                 :domains ["www.baidu.com"])
        => #object[clojure_dns.core$request$fn__8592 0x6f9b024c "clojure_dns.core$request$fn__8592@6f9b024c"]
        Loading src/clojure_dns/core.clj...
        CompilerException java.lang.RuntimeException: Unable to resolve symbol: % in this context, compiling:(/Users/lianshitw/Desktop/Clojure/clojure-dns/src/clojure_dns/core.clj:32:9)

        Loading src/clojure_dns/core.clj... done
        (request :host "1.1.1.1"
                 :domains ["www.baidu.com"])
        => #object[java.nio.HeapByteBuffer 0x76ed3c6e "java.nio.HeapByteBuffer[pos=0 lim=63 cap=63]"]
        Loading src/clojure_dns/core.clj... done
        (request :host "1.1.1.1"
                 :domains ["www.baidu.com"])
        => #object[clojure.core$partial$fn__5563 0x3c1823c5 "clojure.core$partial$fn__5563@3c1823c5"]
        Loading src/clojure_dns/core.clj... done
        (request :host "1.1.1.1"
                 :domains ["www.baidu.com"])
        MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
        Loading src/clojure_dns/core.clj... done
        (request :host "1.1.1.1"
                 :domains ["www.baidu.com"])
        => #object[java.nio.HeapByteBuffer 0x7a0316de "java.nio.HeapByteBuffer[pos=0 lim=63 cap=63]"]
        Loading src/clojure_dns/core.clj... done
        (request :host "1.1.1.1"
                 :domains ["www.baidu.com"])
        E8 BD 81 80 00 01 00 04  00 00 00 00 03 77 77 77      è............www
        05 62 61 69 64 75 03 63  6F 6D 00 00 01 00 01 C0      .baidu.com.....À
        0C 00 05 00 01 00 00 02  3D 00 0F 03 77 77 77 01      ........=...www.
        61 06 73 68 69 66 65 6E  C0 16 C0 2B 00 05 00 01      a.shifenÀ.À+....
        00 00 00 C4 00 0E 03 77  77 77 07 77 73 68 69 66      ...Ä...www.wshif
        65 6E C0 16 C0 46 00 01  00 01 00 00 00 C5 00 04      enÀ.ÀF.......Å..
        68 C1 58 4D C0 46 00 01  00 01 00 00 00 C5 00 04      hÁXMÀF.......Å..
        68 C1 58 7B                                            hÁX{
                                                                   => nil
                                                                   Loading src/clojure_dns/core.clj... done
                                                                   (request :host "1.1.1.1"
                                                                            :domains ["www.baidu.com"])
                                                                   1E 5F                                                  ._
                                                                   01 00                                                  ..
                                                                   00 01                                                  ..
                                                                   00 00                                                  ..
                                                                   00 00                                                  ..
                                                                   00 00                                                  ..
                                                                   03                                                     .
                                                                   77 77 77                                               www
                                                                   05                                                     .
                                                                   62 61 69 64 75                                         baidu
                                                                   03                                                     .
                                                                   63 6F 6D                                               com
                                                                   00                                                     .
                                                                   00 01                                                  ..
                                                                   00 01                                                  ..
                                                                   Evaluation interrupted.
                                                                   Loading src/clojure_dns/core.clj... done
                                                                   (request :host "1.1.1.1"
                                                                            :domains ["www.baidu.com"])
                                                                   E1 4C                                                  áL
                                                                   01 00                                                  ..
                                                                   00 01                                                  ..
                                                                   00 00                                                  ..
                                                                   00 00                                                  ..
                                                                   00 00                                                  ..
                                                                   03                                                     .
                                                                   77 77 77                                               www
                                                                   05                                                     .
                                                                   62 61 69 64 75                                         baidu
                                                                   03                                                     .
                                                                   63 6F 6D                                               com
                                                                   00                                                     .
                                                                   00 01                                                  ..
                                                                   00 01                                                  ..
                                                                   ====================
                                                                   Evaluation interrupted.
                                                                   (request :host "114.114.114.114"
                                                                            :domains ["www.baidu.com"])
                                                                   7E BC                                                  ~.
                                                                   01 00                                                  ..
                                                                   00 01                                                  ..
                                                                   00 00                                                  ..
                                                                   00 00                                                  ..
                                                                   00 00                                                  ..
                                                                   03                                                     .
                                                                   77 77 77                                               www
                                                                   05                                                     .
                                                                   62 61 69 64 75                                         baidu
                                                                   03                                                     .
                                                                   63 6F 6D                                               com
                                                                   00                                                     .
                                                                   00 01                                                  ..
                                                                   00 01                                                  ..
                                                                   ====================
                                                                   Evaluation interrupted.
                                                                   Loading src/clojure_dns/core.clj... done
                                                                   (request :host "114.114.114.114"
                                                                            :domains ["www.hao123.com"])
                                                                   E8 28                                                  è(
                                                                                                                             01 00                                                  ..
                                                                                                                             00 01                                                  ..
                                                                                                                             00 00                                                  ..
                                                                                                                             00 00                                                  ..
                                                                                                                             00 00                                                  ..
                                                                                                                             03                                                     .
                                                                                                                             77 77 77                                               www
                                                                                                                             06                                                     .
                                                                                                                             68 61 6F 31 32 33                                      hao123
                                                                                                                             03                                                     .
                                                                                                                             63 6F 6D                                               com
                                                                                                                             00                                                     .
                                                                                                                             00 01                                                  ..
                                                                                                                             00 01                                                  ..
                                                                                                                             ====================
                                                                                                                             Evaluation interrupted.
                                                                                                                             (request :host "114.114.114.114"
                                                                                                                                      :domains ["www.hao123.com"])
                                                                                                                             0D F1                                                  .ñ
                                                                                                                             01 00                                                  ..
                                                                                                                             00 01                                                  ..
                                                                                                                             00 00                                                  ..
                                                                                                                             00 00                                                  ..
                                                                                                                             00 00                                                  ..
                                                                                                                             03                                                     .
                                                                                                                             77 77 77                                               www
                                                                                                                             06                                                     .
                                                                                                                             68 61 6F 31 32 33                                      hao123
                                                                                                                             03                                                     .
                                                                                                                             63 6F 6D                                               com
                                                                                                                             00                                                     .
                                                                                                                             00 01                                                  ..
                                                                                                                             00 01                                                  ..
                                                                                                                             ====================
                                                                                                                             (request :host "8.8.8.8"
                                                                                                                                      :domains ["www.hao123.com"])
                                                                                                                             Evaluation interrupted.
                                                                                                                             BE 78                                                  .x
                                                                                                                             01 00                                                  ..
                                                                                                                             00 01                                                  ..
                                                                                                                             00 00                                                  ..
                                                                                                                             00 00                                                  ..
                                                                                                                             00 00                                                  ..
                                                                                                                             03                                                     .
                                                                                                                             77 77 77                                               www
                                                                                                                             06                                                     .
                                                                                                                             68 61 6F 31 32 33                                      hao123
                                                                                                                             03                                                     .
                                                                                                                             63 6F 6D                                               com
                                                                                                                             00                                                     .
                                                                                                                             00 01                                                  ..
                                                                                                                             00 01                                                  ..
                                                                                                                             ====================
                                                                                                                             Evaluation interrupted.
                                                                                                                             (request :host "8.8.8.8"
                                                                                                                                      :domains ["www.hao123.com"])
                                                                                                                             AB BE                                                  ..
                                                                                                                             01 00                                                  ..
                                                                                                                             00 01                                                  ..
                                                                                                                             00 00                                                  ..
                                                                                                                             00 00                                                  ..
                                                                                                                             00 00                                                  ..
                                                                                                                             03                                                     .
                                                                                                                             77 77 77                                               www
                                                                                                                             06                                                     .
                                                                                                                             68 61 6F 31 32 33                                      hao123
                                                                                                                             03                                                     .
                                                                                                                             63 6F 6D                                               com
                                                                                                                             00                                                     .
                                                                                                                             00 01                                                  ..
                                                                                                                             00 01                                                  ..
                                                                                                                             ====================

                                                                                                                             Process finished with exit code 137 (interrupted by signal 9: SIGKILL)


                                                                                                                             Starting nREPL server...
                                                                                                                             /Library/Java/JavaVirtualMachines/jdk1.8.0_60.jdk/Contents/Home/bin/java -Dfile.encoding=UTF-8 -XX:-OmitStackTraceInFastThrow -Dclojure.compile.path=/Users/lianshitw/Desktop/Clojure/clojure-dns/target/classes -Dclojure-dns.version=0.1.0-SNAPSHOT -Dclojure.debug=false -classpath /Users/lianshitw/Desktop/Clojure/clojure-dns/test:/Users/lianshitw/Desktop/Clojure/clojure-dns/src:/Users/lianshitw/Desktop/Clojure/clojure-dns/dev-resources:/Users/lianshitw/Desktop/Clojure/clojure-dns/resources:/Users/lianshitw/Desktop/Clojure/clojure-dns/target/classes:/Users/lianshitw/.m2/repository/io/netty/netty-all/4.1.11.Final/netty-all-4.1.11.Final.jar:/Users/lianshitw/.m2/repository/com/taoensso/tufte/2.0.0/tufte-2.0.0.jar:/Users/lianshitw/.m2/repository/gloss/gloss/0.2.6/gloss-0.2.6.jar:/Users/lianshitw/.m2/repository/com/taoensso/truss/1.5.0/truss-1.5.0.jar:/Users/lianshitw/.m2/repository/io/aleph/dirigiste/0.1.3/dirigiste-0.1.3.jar:/Users/lianshitw/.m2/repository/org/clojure/tools.nrepl/0.2.12/tools.nrepl-0.2.12.jar:/Users/lianshitw/.m2/repository/clojure-complete/clojure-complete/0.2.4/clojure-complete-0.2.4.jar:/Users/lianshitw/.m2/repository/potemkin/potemkin/0.4.3/potemkin-0.4.3.jar:/Users/lianshitw/.m2/repository/org/clojure/clojure/1.9.0/clojure-1.9.0.jar:/Users/lianshitw/.m2/repository/primitive-math/primitive-math/0.1.6/primitive-math-0.1.6.jar:/Users/lianshitw/.m2/repository/manifold/manifold/0.1.3/manifold-0.1.3.jar:/Users/lianshitw/.m2/repository/clj-tuple/clj-tuple/0.2.2/clj-tuple-0.2.2.jar:/Users/lianshitw/.m2/repository/aleph/aleph/0.4.4/aleph-0.4.4.jar:/Users/lianshitw/.m2/repository/com/taoensso/encore/2.94.0/encore-2.94.0.jar:/Users/lianshitw/.m2/repository/org/clojure/core.specs.alpha/0.1.24/core.specs.alpha-0.1.24.jar:/Users/lianshitw/.m2/repository/org/clojure/tools.logging/0.3.1/tools.logging-0.3.1.jar:/Users/lianshitw/.m2/repository/riddley/riddley/0.1.12/riddley-0.1.12.jar:/Users/lianshitw/.m2/repository/byte-streams/byte-streams/0.2.4/byte-streams-0.2.4.jar:/Users/lianshitw/.m2/repository/org/clojure/tools.reader/1.2.1/tools.reader-1.2.1.jar:/Users/lianshitw/.m2/repository/org/clojure/spec.alpha/0.1.143/spec.alpha-0.1.143.jar clojure.main -i /private/var/folders/v3/1lq5jrfn02z6k3__3mx1cvxc0000gn/T/form-init4834992123025318464.clj
                                                                                                                             Connecting to local nREPL server...
                                                                                                                             Clojure 1.9.0
                                                                                                                             nREPL server started on port 55729 on host 127.0.0.1 - nrepl://127.0.0.1:55729
                                                                                                                             Loading src/clojure_dns/core.clj... done
                                                                                                                             (use 'clojure-dns.core)
                                                                                                                             => nil
                                                                                                                             (request :host "8.8.8.8"
                                                                                                                                      :domains ["www.hao123.com"])
                                                                                                                             Evaluation interrupted.
                                                                                                                             (request :host "8.8.8.8"
                                                                                                                                      :domains ["www.baidu.com"])
                                                                                                                             B9 EF 85 80 00 01 00 02  00 00 00 00 03 77 77 77      .ï...........www
                                                                                                                             05 62 61 69 64 75 03 63  6F 6D 00 00 01 00 01 C0      .baidu.com.....À
                                                                                                                             0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AC C0      ........X...èç.À
                                                                                                                             0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AD         ........X...èç.
                                                                                                                             => nil
                                                                                                                             Loading src/clojure_dns/core.clj... done
                                                                                                                             (def a (request :host "8.8.8.8"
                                                                                                                                             :domains ["www.baidu.com"]))
                                                                                                                             => #'user/a
                                                                                                                             a
                                                                                                                             => #object[java.nio.HeapByteBuffer 0x339b0b00 "java.nio.HeapByteBuffer[pos=0 lim=63 cap=63]"]
                                                                                                                             (use 'clojure-dns.protocol)
                                                                                                                             => nil
                                                                                                                             (require 'gloss.io)
                                                                                                                             => nil
                                                                                                                             (require '[gloss.io :as io])
                                                                                                                             => nil
                                                                                                                             (io/decode-all protocol a)
                                                                                                                             MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                             Loading src/clojure_dns/core.clj... done
                                                                                                                             (def b (request :host "8.8.8.8"
                                                                                                                                             :domains ["www.baidu.com"]))
                                                                                                                             => #'user/b
                                                                                                                             b
                                                                                                                             => #object["[B" 0x191ccbe5 "[B@191ccbe5"]
                                                                                                                             (io/decode-all protocol b)
                                                                                                                             MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                             (require 'byte-streams)
                                                                                                                             => nil
                                                                                                                             (byte-streams/print-bytes b)
                                                                                                                             D3 33 85 80 00 01 00 02  00 00 00 00 03 77 77 77      Ó3...........www
                                                                                                                             05 62 61 69 64 75 03 63  6F 6D 00 00 01 00 01 C0      .baidu.com.....À
                                                                                                                             0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AC C0      ........X...èç.À
                                                                                                                             0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AD         ........X...èç.
                                                                                                                             => nil
                                                                                                                             (io/decode protocol b)
                                                                                                                             MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                             (io/contiguous b)
                                                                                                                             => #object[java.nio.HeapByteBuffer 0x30981dce "java.nio.HeapByteBuffer[pos=0 lim=63 cap=63]"]
                                                                                                                             (io/decode-all protocol (io/contiguous b))
                                                                                                                             MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                             (byte-streams/print-bytes (io/contiguous b))
                                                                                                                             D3 33 85 80 00 01 00 02  00 00 00 00 03 77 77 77      Ó3...........www
                                                                                                                             05 62 61 69 64 75 03 63  6F 6D 00 00 01 00 01 C0      .baidu.com.....À
                                                                                                                             0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AC C0      ........X...èç.À
                                                                                                                             0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AD         ........X...èç.
                                                                                                                             => nil
                                                                                                                             (def protocol
                                                                                                                               (compile-frame
                                                                                                                                 (ordered-map :transaction-id :uint16
                                                                                                                                              :flags flags-frame

                                                                                                                                              ;; Automatically populate this field
                                                                                                                                              :query-rrs :uint16
                                                                                                                                              :answer-rrs :uint16
                                                                                                                                              :authority-rrs :uint16
                                                                                                                                              :additional-rrs :uint16

                                                                                                                                              :query (repeated query-field :prefix :none)
                                                                                                                                              ;:answers (repeated rr-field :prefix :none)
                                                                                                                                              ;:authoritative (repeated rr-field :prefix :none)
                                                                                                                                              ;:additional (repeated rr-field :prefix :none)
                                                                                                                                              )
                                                                                                                                 fn-encode
                                                                                                                                 fn-decode))
                                                                                                                             CompilerException java.lang.IllegalStateException: protocol already refers to: #'clojure-dns.protocol/protocol in namespace: user, compiling:(/private/var/folders/v3/1lq5jrfn02z6k3__3mx1cvxc0000gn/T/form-init4834992123025318464.clj:1:1)
                                                                                                                             (def pr
                                                                                                                               (compile-frame
                                                                                                                                 (ordered-map :transaction-id :uint16
                                                                                                                                              :flags flags-frame

                                                                                                                                              ;; Automatically populate this field
                                                                                                                                              :query-rrs :uint16
                                                                                                                                              :answer-rrs :uint16
                                                                                                                                              :authority-rrs :uint16
                                                                                                                                              :additional-rrs :uint16

                                                                                                                                              :query (repeated query-field :prefix :none)
                                                                                                                                              ;:answers (repeated rr-field :prefix :none)
                                                                                                                                              ;:authoritative (repeated rr-field :prefix :none)
                                                                                                                                              ;:additional (repeated rr-field :prefix :none)
                                                                                                                                              )
                                                                                                                                 fn-encode
                                                                                                                                 fn-decode))
                                                                                                                             WARNING: pr already refers to: #'clojure.core/pr in namespace: user, being replaced by: #'user/pr
                                                                                                                             CompilerException java.lang.RuntimeException: Unable to resolve symbol: compile-frame in this context, compiling:(/private/var/folders/v3/1lq5jrfn02z6k3__3mx1cvxc0000gn/T/form-init4834992123025318464.clj:2:3)
                                                                                                                             (use 'gloss.core)
                                                                                                                             => nil
                                                                                                                             (def pr
                                                                                                                               (compile-frame
                                                                                                                                 (ordered-map :transaction-id :uint16
                                                                                                                                              :flags flags-frame

                                                                                                                                              ;; Automatically populate this field
                                                                                                                                              :query-rrs :uint16
                                                                                                                                              :answer-rrs :uint16
                                                                                                                                              :authority-rrs :uint16
                                                                                                                                              :additional-rrs :uint16

                                                                                                                                              :query (repeated query-field :prefix :none)
                                                                                                                                              ;:answers (repeated rr-field :prefix :none)
                                                                                                                                              ;:authoritative (repeated rr-field :prefix :none)
                                                                                                                                              ;:additional (repeated rr-field :prefix :none)
                                                                                                                                              )
                                                                                                                                 fn-encode
                                                                                                                                 fn-decode))
                                                                                                                             => #'user/pr
                                                                                                                             (io/decode-all pr b)
                                                                                                                             MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                             (def pr
                                                                                                                               (compile-frame
                                                                                                                                 (ordered-map :transaction-id :uint16
                                                                                                                                              :flags flags-frame

                                                                                                                                              ;; Automatically populate this field
                                                                                                                                              :query-rrs :uint16
                                                                                                                                              :answer-rrs :uint16
                                                                                                                                              :authority-rrs :uint16
                                                                                                                                              :additional-rrs :uint16

                                                                                                                                              ;:query (repeated query-field :prefix :none)
                                                                                                                                              ;:answers (repeated rr-field :prefix :none)
                                                                                                                                              ;:authoritative (repeated rr-field :prefix :none)
                                                                                                                                              ;:additional (repeated rr-field :prefix :none)
                                                                                                                                              )
                                                                                                                                 fn-encode
                                                                                                                                 fn-decode))
                                                                                                                             => #'user/pr
                                                                                                                             (io/decode-all pr b)
                                                                                                                             {:transaction-id 54067, :flags {:qr true, :opcode 0, :aa true, :tc false, :rd true, :ra true, :fill 0, :rcode 0}, :query-rrs 1, :answer-rrs 2, :authority-rrs 0, :additional-rrs 0}
                                                                                                                             {:transaction-id 887, :flags {:qr false, :opcode 14, :aa true, :tc true, :rd true, :ra false, :fill 7, :rcode 7}, :query-rrs 1378, :answer-rrs 24937, :authority-rrs 25717, :additional-rrs 867}
                                                                                                                             {:transaction-id 28525, :flags {:qr false, :opcode 0, :aa false, :tc false, :rd false, :ra false, :fill 0, :rcode 0}, :query-rrs 256, :answer-rrs 448, :authority-rrs 3072, :additional-rrs 256}
                                                                                                                             {:transaction-id 256, :flags {:qr false, :opcode 0, :aa false, :tc false, :rd false, :ra false, :fill 0, :rcode 2}, :query-rrs 22528, :answer-rrs 1207, :authority-rrs 59623, :additional-rrs 44224}
                                                                                                                             {:transaction-id 3072, :flags {:qr false, :opcode 0, :aa false, :tc false, :rd true, :ra false, :fill 0, :rcode 0}, :query-rrs 256, :answer-rrs 2, :authority-rrs 22528, :additional-rrs 1207}
                                                                                                                             Exception Bytes left over after decoding sequence of frames.  gloss.io/decoder/fn--8228 (io.clj:96)
                                                                                                                             Loading src/clojure_dns/protocol.clj... done
                                                                                                                             (def pr
                                                                                                                               (compile-frame
                                                                                                                                 (ordered-map :transaction-id :uint16
                                                                                                                                              :flags flags-frame

                                                                                                                                              ;; Automatically populate this field
                                                                                                                                              :query-rrs :uint16
                                                                                                                                              :answer-rrs :uint16
                                                                                                                                              :authority-rrs :uint16
                                                                                                                                              :additional-rrs :uint16

                                                                                                                                              ;:query (repeated query-field :prefix :none)
                                                                                                                                              ;:answers (repeated rr-field :prefix :none)
                                                                                                                                              ;:authoritative (repeated rr-field :prefix :none)
                                                                                                                                              ;:additional (repeated rr-field :prefix :none)
                                                                                                                                              )
                                                                                                                                 fn-encode
                                                                                                                                 fn-decode))
                                                                                                                             => #'user/pr
                                                                                                                             (def pr
                                                                                                                               (compile-frame
                                                                                                                                 (ordered-map :transaction-id :uint16
                                                                                                                                              :flags flags-frame

                                                                                                                                              ;; Automatically populate this field
                                                                                                                                              :query-rrs :uint16
                                                                                                                                              :answer-rrs :uint16
                                                                                                                                              :authority-rrs :uint16
                                                                                                                                              :additional-rrs :uint16

                                                                                                                                              :query (repeated query-field :prefix :none)
                                                                                                                                              ;:answers (repeated rr-field :prefix :none)
                                                                                                                                              ;:authoritative (repeated rr-field :prefix :none)
                                                                                                                                              ;:additional (repeated rr-field :prefix :none)
                                                                                                                                              )
                                                                                                                                 fn-encode
                                                                                                                                 fn-decode))
                                                                                                                             => #'user/pr
                                                                                                                             (io/decode-all pr b)
                                                                                                                             MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                             (io/encode query-field {:name ["www" "aaa"]
                                                                                                                                                     :type 1
                                                                                                                                                     :class 2})
                                                                                                                             =>
                                                                                                                             (#object[java.nio.HeapByteBuffer 0x7278908 "java.nio.HeapByteBuffer[pos=0 lim=1 cap=1]"]
                                                                                                                               #object[java.nio.HeapByteBuffer 0x294ae5e0 "java.nio.HeapByteBuffer[pos=0 lim=3 cap=3]"]
                                                                                                                               #object[java.nio.HeapByteBuffer 0x50277273 "java.nio.HeapByteBuffer[pos=0 lim=1 cap=1]"]
                                                                                                                               #object[java.nio.HeapByteBuffer 0x383d4348 "java.nio.HeapByteBuffer[pos=0 lim=3 cap=3]"]
                                                                                                                               #object[java.nio.HeapByteBuffer 0x369f28e "java.nio.HeapByteBuffer[pos=0 lim=2 cap=2]"]
                                                                                                                               #object[java.nio.HeapByteBuffer 0x7df262e6 "java.nio.HeapByteBuffer[pos=0 lim=2 cap=2]"])
                                                                                                                             (io/decode query-field
                                                                                                                                        (io/encode query-field {:name ["www" "aaa"]
                                                                                                                                                                :type 1
                                                                                                                                                                :class 2}))
                                                                                                                             Exception Cannot evenly divide bytes into sequence of frames.  gloss.core.protocols/take-all/fn--7199 (protocols.clj:107)
                                                                                                                             (io/decode-all query-field
                                                                                                                                            (io/encode query-field {:name ["www" "aaa"]
                                                                                                                                                                    :type 1
                                                                                                                                                                    :class 2}))
                                                                                                                             Exception Cannot evenly divide bytes into sequence of frames.  gloss.core.protocols/take-all/fn--7199 (protocols.clj:107)
                                                                                                                             (byte-streams/print-bytes
                                                                                                                               (io/encode query-field {:name ["www" "aaa"]
                                                                                                                                                       :type 1
                                                                                                                                                       :class 2}))
                                                                                                                             03                                                     .
                                                                                                                             77 77 77                                               www
                                                                                                                             03                                                     .
                                                                                                                             61 61 61                                               aaa
                                                                                                                             00 01                                                  ..
                                                                                                                             00 02                                                  ..
                                                                                                                             => nil
                                                                                                                             (byte-streams/print-bytes
                                                                                                                               (io/encode (repeated query-field :prefix :none)
                                                                                                                                          [{:name ["www" "aaa"]
                                                                                                                                            :type 1
                                                                                                                                            :class 2}
                                                                                                                                           {:name ["www" "bbb"]
                                                                                                                                            :type 8
                                                                                                                                            :class 8}]))
                                                                                                                             03                                                     .
                                                                                                                             77 77 77                                               www
                                                                                                                             03                                                     .
                                                                                                                             61 61 61                                               aaa
                                                                                                                             00 01                                                  ..
                                                                                                                             00 02                                                  ..
                                                                                                                             03                                                     .
                                                                                                                             77 77 77                                               www
                                                                                                                             03                                                     .
                                                                                                                             62 62 62                                               bbb
                                                                                                                             00 08                                                  ..
                                                                                                                             00 08                                                  ..
                                                                                                                             => nil
                                                                                                                             (io/encode (string :ascii :prefix :none :suffix 0x00) "123")
                                                                                                                             IllegalArgumentException No implementation of method: :write-bytes of protocol: #'gloss.core.protocols/Writer found for class: clojure.lang.Keyword  clojure.core/-cache-protocol-fn (core_deftype.clj:583)
                                                                                                                             (io/encode (ordered-map :name (string :ascii :prefix :none :suffix 0x00))
                                                                                                                                        "123")
                                                                                                                             Exception Expected a map, but got 123  gloss.core.codecs/ordered-map/reify--8184 (codecs.clj:232)
                                                                                                                             (io/encode (ordered-map :name (string :ascii :prefix :none :suffix 0x00))
                                                                                                                                        {:name "123"})
                                                                                                                             IllegalArgumentException No implementation of method: :write-bytes of protocol: #'gloss.core.protocols/Writer found for class: clojure.lang.Keyword  clojure.core/-cache-protocol-fn (core_deftype.clj:583)
                                                                                                                             (io/encode (compile-frame
                                                                                                                                          (ordered-map :name (string :ascii :prefix :none :suffix 0x00)))
                                                                                                                                        {:name "123"})
                                                                                                                             IllegalArgumentException No implementation of method: :write-bytes of protocol: #'gloss.core.protocols/Writer found for class: clojure.lang.Keyword  clojure.core/-cache-protocol-fn (core_deftype.clj:583)
                                                                                                                             (io/encode (compile-frame
                                                                                                                                          (ordered-map :name (string :ascii :prefix :none :suffix 0x00)
                                                                                                                                                       :type :uint16-be))
                                                                                                                                        {:name "123" :type 8})
                                                                                                                             IllegalArgumentException No implementation of method: :write-bytes of protocol: #'gloss.core.protocols/Writer found for class: clojure.lang.Keyword  clojure.core/-cache-protocol-fn (core_deftype.clj:583)
                                                                                                                             (io/encode (compile-frame
                                                                                                                                          (ordered-map :name (string :ascii :prefix :none :suffix 0x00)
                                                                                                                                                       :type :uint16-be))
                                                                                                                                        {:name "123" :type 8})
                                                                                                                             IllegalArgumentException No implementation of method: :write-bytes of protocol: #'gloss.core.protocols/Writer found for class: clojure.lang.Keyword  clojure.core/-cache-protocol-fn (core_deftype.clj:583)
                                                                                                                             (io/encode (compile-frame
                                                                                                                                          (ordered-map :name (string :utf-8 :prefix :none :suffix 0x00)
                                                                                                                                                       :type :uint16-be))
                                                                                                                                        {:name "123" :type 8})
                                                                                                                             IllegalArgumentException No implementation of method: :write-bytes of protocol: #'gloss.core.protocols/Writer found for class: clojure.lang.Keyword  clojure.core/-cache-protocol-fn (core_deftype.clj:583)
                                                                                                                             (io/encode (compile-frame
                                                                                                                                          (ordered-map :name (string :utf-8 :prefix :none :suffix ",")
                                                                                                                                                       :type :uint16-be))
                                                                                                                                        {:name "123" :type 8})
                                                                                                                             IllegalArgumentException No implementation of method: :write-bytes of protocol: #'gloss.core.protocols/Writer found for class: clojure.lang.Keyword  clojure.core/-cache-protocol-fn (core_deftype.clj:583)
                                                                                                                             (compile-frame
                                                                                                                               (ordered-map :name (string :ascii :prefix :none :suffix ",")
                                                                                                                                            :type :uint16-be))

                                                                                                                             => #object[gloss.core.codecs$ordered_map$reify__8184 0x543e7980 "gloss.core.codecs$ordered_map$reify__8184@543e7980"]
                                                                                                                             (io/encode
                                                                                                                               (compile-frame
                                                                                                                                 (ordered-map :name (string :ascii :prefix :none :suffix ",")
                                                                                                                                              :type :uint16-be))

                                                                                                                               RuntimeException EOF while reading, starting at line 1  clojure.lang.Util.runtimeException (Util.java:221)
                                                                                                                               (io/encode
                                                                                                                                 (compile-frame
                                                                                                                                   (ordered-map :name (string :ascii :prefix :none :suffix ",")
                                                                                                                                                :type :uint16-be))
                                                                                                                                 {:name "123"
                                                                                                                                  :type 1})

                                                                                                                               IllegalArgumentException No implementation of method: :write-bytes of protocol: #'gloss.core.protocols/Writer found for class: clojure.lang.Keyword  clojure.core/-cache-protocol-fn (core_deftype.clj:583)
                                                                                                                               (io/encode
                                                                                                                                 (compile-frame
                                                                                                                                   (ordered-map :name (string :ascii :prefix :none :suffix ",")
                                                                                                                                                :type :uint16-be))
                                                                                                                                 {:name ""
                                                                                                                                  :type 1})

                                                                                                                               IllegalArgumentException No implementation of method: :write-bytes of protocol: #'gloss.core.protocols/Writer found for class: clojure.lang.Keyword  clojure.core/-cache-protocol-fn (core_deftype.clj:583)
                                                                                                                               (use 'gloss.io)
                                                                                                                               => nil
                                                                                                                               (use 'gloss.core)
                                                                                                                               => nil
                                                                                                                               (io/encode
                                                                                                                                 (compile-frame
                                                                                                                                   (ordered-map :name (string :ascii :prefix :none :suffix ",")
                                                                                                                                                :type :uint16-be))
                                                                                                                                 {:name ""
                                                                                                                                  :type 1})

                                                                                                                               IllegalArgumentException No implementation of method: :write-bytes of protocol: #'gloss.core.protocols/Writer found for class: clojure.lang.Keyword  clojure.core/-cache-protocol-fn (core_deftype.clj:583)
                                                                                                                               (def aaa
                                                                                                                                 (compile-frame
                                                                                                                                   (ordered-map :name (string :ascii :prefix :none :suffix ",")
                                                                                                                                                :type :uint16-be)))

                                                                                                                               => #'user/aaa
                                                                                                                               (io/encode aaa "123")
                                                                                                                               Exception Expected a map, but got 123  gloss.core.codecs/ordered-map/reify--8184 (codecs.clj:232)
                                                                                                                               (io/encode aaa {:name "123"})
                                                                                                                               IllegalArgumentException No implementation of method: :write-bytes of protocol: #'gloss.core.protocols/Writer found for class: clojure.lang.Keyword  clojure.core/-cache-protocol-fn (core_deftype.clj:583)
                                                                                                                               (def aaa
                                                                                                                                 (compile-frame
                                                                                                                                   (ordered-map :dns-name (string :ascii :prefix :none :suffix ",")
                                                                                                                                                :type :uint16-be)))

                                                                                                                               => #'user/aaa
                                                                                                                               (io/encode aaa {:name "123"})
                                                                                                                               Exception Expected a CharSequence, but got    gloss.data.string.codecs/string-codec/reify--7502 (codecs.clj:70)
                                                                                                                               (io/encode aaa {:dns-name "123"})
                                                                                                                               IllegalArgumentException No implementation of method: :write-bytes of protocol: #'gloss.core.protocols/Writer found for class: clojure.lang.Keyword  clojure.core/-cache-protocol-fn (core_deftype.clj:583)
                                                                                                                               (io/encode
                                                                                                                                 (compile-frame
                                                                                                                                   (ordered-map :name (string :ascii :suffix ",")
                                                                                                                                                :type :uint16-be))
                                                                                                                                 {:name ""
                                                                                                                                  :type 1})

                                                                                                                               =>
                                                                                                                               (#object[java.nio.HeapByteBuffer 0x15c51eb2 "java.nio.HeapByteBuffer[pos=0 lim=1 cap=1]"]
                                                                                                                                 #object[java.nio.HeapByteBuffer 0x3f27e085 "java.nio.HeapByteBuffer[pos=0 lim=2 cap=2]"])
                                                                                                                               (byte-streams/print-bytes
                                                                                                                                 (io/encode
                                                                                                                                   (compile-frame
                                                                                                                                     (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                  :type :uint16-be))
                                                                                                                                   {:name ""
                                                                                                                                    :type 1}))

                                                                                                                               00                                                     .
                                                                                                                               00 01                                                  ..
                                                                                                                               => nil
                                                                                                                               (byte-streams/print-bytes
                                                                                                                                 (io/encode
                                                                                                                                   (compile-frame
                                                                                                                                     (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                  :type :uint16-be))
                                                                                                                                   {:name "123"
                                                                                                                                    :type 1}))

                                                                                                                               31 32 33                                               123
                                                                                                                               00                                                     .
                                                                                                                               00 01                                                  ..
                                                                                                                               => nil
                                                                                                                               (byte-streams/print-bytes
                                                                                                                                 (io/encode
                                                                                                                                   (compile-frame
                                                                                                                                     (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                  :type :uint16-be))
                                                                                                                                   {:name "www.baidu.com"
                                                                                                                                    :type 1}))

                                                                                                                               77 77 77 2E 62 61 69 64  75 2E 63 6F 6D               www.baidu.com
                                                                                                                               00                                                     .
                                                                                                                               00 01                                                  ..
                                                                                                                               => nil
                                                                                                                               (byte-streams/print-bytes
                                                                                                                                 (io/encode
                                                                                                                                   (compile-frame
                                                                                                                                     (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                  :type :uint16-be)
                                                                                                                                     (fn [data]
                                                                                                                                       (let [s (clojure.string/split (:name data) #"\.")
                                                                                                                                             fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                             new (io/encode fr s)]
                                                                                                                                         (update data :name (byte-streams/convert new String))))
                                                                                                                                     (fn [data] data))
                                                                                                                                   {:name "www.baidu.com"
                                                                                                                                    :type 1}))

                                                                                                                               ClassCastException java.lang.String cannot be cast to clojure.lang.IFn  clojure.core/update (core.clj:6116)
                                                                                                                               (byte-streams/print-bytes
                                                                                                                                 (io/encode
                                                                                                                                   (compile-frame
                                                                                                                                     (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                  :type :uint16-be)
                                                                                                                                     (fn [data]
                                                                                                                                       (let [s (clojure.string/split (:name data) #"\.")
                                                                                                                                             fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                             new (io/encode fr s)]
                                                                                                                                         (update data :name "bbb")))
                                                                                                                                     (fn [data] data))
                                                                                                                                   {:name "www.baidu.com"
                                                                                                                                    :type 1}))

                                                                                                                               ClassCastException java.lang.String cannot be cast to clojure.lang.IFn  clojure.core/update (core.clj:6116)
                                                                                                                               (byte-streams/print-bytes
                                                                                                                                 (io/encode
                                                                                                                                   (compile-frame
                                                                                                                                     (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                  :type :uint16-be)
                                                                                                                                     (fn [data]
                                                                                                                                       (let [s (clojure.string/split (:name data) #"\.")
                                                                                                                                             fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                             new (io/encode fr s)]
                                                                                                                                         (assoc data :name "bbb")))
                                                                                                                                     (fn [data] data))
                                                                                                                                   {:name "www.baidu.com"
                                                                                                                                    :type 1}))

                                                                                                                               62 62 62                                               bbb
                                                                                                                               00                                                     .
                                                                                                                               00 01                                                  ..
                                                                                                                               => nil
                                                                                                                               (byte-streams/print-bytes
                                                                                                                                 (io/encode
                                                                                                                                   (compile-frame
                                                                                                                                     (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                  :type :uint16-be)
                                                                                                                                     (fn [data]
                                                                                                                                       (let [s (clojure.string/split (:name data) #"\.")
                                                                                                                                             fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                             new (io/encode fr s)]
                                                                                                                                         (assoc data :name new)))
                                                                                                                                     (fn [data] data))
                                                                                                                                   {:name "www.baidu.com"
                                                                                                                                    :type 1}))

                                                                                                                               Exception Expected a CharSequence, but got clojure.lang.LazySeq@8535dfa9 class clojure.lang.LazySeq  gloss.data.string.codecs/string-codec/reify--7502 (codecs.clj:70)
                                                                                                                               (byte-streams/print-bytes
                                                                                                                                 (io/encode
                                                                                                                                   (compile-frame
                                                                                                                                     (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                  :type :uint16-be)
                                                                                                                                     (fn [data]
                                                                                                                                       (let [s (clojure.string/split (:name data) #"\.")
                                                                                                                                             fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                             new (io/encode fr s)]
                                                                                                                                         (assoc data :name (byte-streams/convert new String)))
                                                                                                                                       (fn [data] data))
                                                                                                                                     {:name "www.baidu.com"
                                                                                                                                      :type 1}))

                                                                                                                                 RuntimeException EOF while reading, starting at line 1  clojure.lang.Util.runtimeException (Util.java:221)
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                    :type :uint16-be)
                                                                                                                                       (fn [data]
                                                                                                                                         (let [s (clojure.string/split (:name data) #"\.")
                                                                                                                                               fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                               new (io/encode fr s)]
                                                                                                                                           (assoc data :name (byte-streams/convert new String))))
                                                                                                                                       (fn [data] data))
                                                                                                                                     {:name "www.baidu.com"
                                                                                                                                      :type 1}))

                                                                                                                                 03 77 77 77 05 62 61 69  64 75 03 63 6F 6D            .www.baidu.com
                                                                                                                                 00                                                     .
                                                                                                                                 00 01                                                  ..
                                                                                                                                 => nil
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                      :type :uint16-be))
                                                                                                                                       (fn [data]
                                                                                                                                         (let [s (clojure.string/split (:name data) #"\.")
                                                                                                                                               fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                               new (io/encode fr s)]
                                                                                                                                           (map #(assoc % :name (byte-streams/convert new String)) data)
                                                                                                                                           ))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}]))

                                                                                                                                 NullPointerException   java.util.regex.Matcher.getTextLength (Matcher.java:1283)
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                      :type :uint16-be))
                                                                                                                                       (fn [data]
                                                                                                                                         (let [s (clojure.string/split (:name data) #"\.")
                                                                                                                                               fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                               new (io/encode fr s)]
                                                                                                                                           (println data)
                                                                                                                                           (map #(assoc % :name (byte-streams/convert new String)) data)
                                                                                                                                           ))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}]))

                                                                                                                                 NullPointerException   java.util.regex.Matcher.getTextLength (Matcher.java:1283)
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                      :type :uint16-be))
                                                                                                                                       (fn [data]
                                                                                                                                         (println data)
                                                                                                                                         (let [s (clojure.string/split (:name data) #"\.")
                                                                                                                                               fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                               new (io/encode fr s)]
                                                                                                                                           (map #(assoc % :name (byte-streams/convert new String)) data)
                                                                                                                                           ))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}]))

                                                                                                                                 [{:name www.baidu.com, :type 1} {:name www.google.com, :type 2}]
                                                                                                                                 NullPointerException   java.util.regex.Matcher.getTextLength (Matcher.java:1283)
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                      :type :uint16-be))
                                                                                                                                       (fn [data]
                                                                                                                                         (map (fn [d]
                                                                                                                                                (let [s (clojure.string/split (:name d) #"\.")
                                                                                                                                                      fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                                      new (io/encode fr s)]
                                                                                                                                                  (assoc % :name (byte-streams/convert new String)))
                                                                                                                                                data)
                                                                                                                                              ))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}]))

                                                                                                                                 CompilerException java.lang.RuntimeException: Unable to resolve symbol: % in this context, compiling:(/private/var/folders/v3/1lq5jrfn02z6k3__3mx1cvxc0000gn/T/form-init4834992123025318464.clj:12:15)
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                      :type :uint16-be))
                                                                                                                                       (fn [data]
                                                                                                                                         (map (fn [d]
                                                                                                                                                (let [s (clojure.string/split (:name d) #"\.")
                                                                                                                                                      fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                                      new (io/encode fr s)]
                                                                                                                                                  (assoc d :name (byte-streams/convert new String)))
                                                                                                                                                data)
                                                                                                                                              ))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}]))

                                                                                                                                 Exception Expected a sequence, but got clojure.core$map$fn__5583@664ca4f3  gloss.core.codecs/wrap-prefixed-sequence/reify--8146 (codecs.clj:128)
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                      :type :uint16-be))
                                                                                                                                       (fn [data]
                                                                                                                                         (println data)
                                                                                                                                         (println (map (fn [d]
                                                                                                                                                         (let [s (clojure.string/split (:name d) #"\.")
                                                                                                                                                               fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                                               new (io/encode fr s)]
                                                                                                                                                           (assoc d :name (byte-streams/convert new String)))
                                                                                                                                                         data))))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}]))

                                                                                                                                 [{:name www.baidu.com, :type 1} {:name www.google.com, :type 2}]
                                                                                                                                 #object[clojure.core$map$fn__5583 0x22086f73 clojure.core$map$fn__5583@22086f73]
                                                                                                                                 Exception Expected a sequence, but got   gloss.core.codecs/wrap-prefixed-sequence/reify--8146 (codecs.clj:128)
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                      :type :uint16-be))
                                                                                                                                       (fn [data]
                                                                                                                                         (println data)
                                                                                                                                         (println (doall (map (fn [d]
                                                                                                                                                                (let [s (clojure.string/split (:name d) #"\.")
                                                                                                                                                                      fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                                                      new (io/encode fr s)]
                                                                                                                                                                  (assoc d :name (byte-streams/convert new String)))
                                                                                                                                                                data)))))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}]))

                                                                                                                                 [{:name www.baidu.com, :type 1} {:name www.google.com, :type 2}]
                                                                                                                                 IllegalArgumentException Don't know how to create ISeq from: clojure.core$map$fn__5583  clojure.lang.RT.seqFrom (RT.java:550)
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                      :type :uint16-be))
                                                                                                                                       (fn [data]
                                                                                                                                         (println data)
                                                                                                                                         (let [n (map (fn [d]
                                                                                                                                                        (let [s (clojure.string/split (:name d) #"\.")
                                                                                                                                                              fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                                              new (io/encode fr s)]
                                                                                                                                                          (assoc d :name (byte-streams/convert new String))))
                                                                                                                                                      data)]
                                                                                                                                           (println n)
                                                                                                                                           n))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}]))

                                                                                                                                 [{:name www.baidu.com, :type 1} {:name www.google.com, :type 2}]
                                                                                                                                 ({:name wwwbaiducom, :type 1} {:name wwwgooglecom, :type 2})
                                                                                                                                 00 00 00 02                                            ....
                                                                                                                                 03 77 77 77 05 62 61 69  64 75 03 63 6F 6D            .www.baidu.com
                                                                                                                                 00                                                     .
                                                                                                                                 00 01                                                  ..
                                                                                                                                 03 77 77 77 06 67 6F 6F  67 6C 65 03 63 6F 6D         .www.google.com

                                                                                                                                 00 02                                                  ..
                                                                                                                                 => nil
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                      :type :uint16-be)
                                                                                                                                         :prefix :none)
                                                                                                                                       (fn [data]
                                                                                                                                         (println data)
                                                                                                                                         (let [n (map (fn [d]
                                                                                                                                                        (let [s (clojure.string/split (:name d) #"\.")
                                                                                                                                                              fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                                              new (io/encode fr s)]
                                                                                                                                                          (assoc d :name (byte-streams/convert new String))))
                                                                                                                                                      data)]
                                                                                                                                           (println n)
                                                                                                                                           n))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}]))

                                                                                                                                 [{:name www.baidu.com, :type 1} {:name www.google.com, :type 2}]
                                                                                                                                 ({:name wwwbaiducom, :type 1} {:name wwwgooglecom, :type 2})
                                                                                                                                 03 77 77 77 05 62 61 69  64 75 03 63 6F 6D            .www.baidu.com
                                                                                                                                 00                                                     .
                                                                                                                                 00 01                                                  ..
                                                                                                                                 03 77 77 77 06 67 6F 6F  67 6C 65 03 63 6F 6D         .www.google.com

                                                                                                                                 00 02                                                  ..
                                                                                                                                 => nil
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                      :type :uint16-be)
                                                                                                                                         :prefix :none)
                                                                                                                                       (fn [data]
                                                                                                                                         (println data)
                                                                                                                                         (let [n (map (fn [d]
                                                                                                                                                        (let [s (clojure.string/split (:name d) #"\.")
                                                                                                                                                              fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                                              new (io/encode fr s)]
                                                                                                                                                          (assoc d :name (byte-streams/convert new String))))
                                                                                                                                                      data)]
                                                                                                                                           (println n)
                                                                                                                                           n))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}
                                                                                                                                      {:name ""}]))

                                                                                                                                 [{:name www.baidu.com, :type 1} {:name www.google.com, :type 2} {:name }]
                                                                                                                                 ({:name wwwbaiducom, :type 1} {:name wwwgooglecom, :type 2} {:name  })
                                                                                                                                 NullPointerException   clojure.lang.RT.intCast (RT.java:1213)
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                      :type :uint16-be)
                                                                                                                                         :prefix :none)
                                                                                                                                       (fn [data]
                                                                                                                                         (println data)
                                                                                                                                         (let [n (map (fn [d]
                                                                                                                                                        (let [s (clojure.string/split (:name d) #"\.")
                                                                                                                                                              fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                                              new (io/encode fr s)]
                                                                                                                                                          (assoc d :name (byte-streams/convert new String))))
                                                                                                                                                      data)]
                                                                                                                                           (println n)
                                                                                                                                           n))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}
                                                                                                                                      {:name "aaa" :type 3}]))

                                                                                                                                 [{:name www.baidu.com, :type 1} {:name www.google.com, :type 2} {:name aaa, :type 3}]
                                                                                                                                 ({:name wwwbaiducom, :type 1} {:name wwwgooglecom, :type 2} {:name aaa, :type 3})
                                                                                                                                 03 77 77 77 05 62 61 69  64 75 03 63 6F 6D            .www.baidu.com
                                                                                                                                 00                                                     .
                                                                                                                                 00 01                                                  ..
                                                                                                                                 03 77 77 77 06 67 6F 6F  67 6C 65 03 63 6F 6D         .www.google.com

                                                                                                                                 00 02                                                  ..
                                                                                                                                 03 61 61 61                                            .aaa

                                                                                                                                 00 03                                                  ..
                                                                                                                                 => nil
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                      :type :uint16-be)
                                                                                                                                         :prefix :none)
                                                                                                                                       (fn [data]
                                                                                                                                         (println data)
                                                                                                                                         (let [n (map (fn [d]
                                                                                                                                                        (let [s (clojure.string/split (:name d) #"\.")
                                                                                                                                                              fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                                              new (io/encode fr s)]
                                                                                                                                                          (println (byte-streams/convert new String))
                                                                                                                                                          (assoc d :name (byte-streams/convert new String))))
                                                                                                                                                      data)]
                                                                                                                                           (println n)
                                                                                                                                           n))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}
                                                                                                                                      {:name "aaa" :type 3}]))

                                                                                                                                 [{:name www.baidu.com, :type 1} {:name www.google.com, :type 2} {:name aaa, :type 3}]
                                                                                                                                 (wwwbaiducom
                                                                                                                                   wwwgooglecom
                                                                                                                                   aaa
                                                                                                                                   {:name wwwbaiducom, :type 1} {:name wwwgooglecom, :type 2} {:name aaa, :type 3})
                                                                                                                                 03 77 77 77 05 62 61 69  64 75 03 63 6F 6D            .www.baidu.com
                                                                                                                                 00                                                     .
                                                                                                                                 00 01                                                  ..
                                                                                                                                 03 77 77 77 06 67 6F 6F  67 6C 65 03 63 6F 6D         .www.google.com

                                                                                                                                 00 02                                                  ..
                                                                                                                                 03 61 61 61                                            .aaa

                                                                                                                                 00 03                                                  ..
                                                                                                                                 => nil
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix 0x00)
                                                                                                                                                      :type :uint16-be)
                                                                                                                                         :prefix :none)
                                                                                                                                       (fn [data]
                                                                                                                                         (println data)
                                                                                                                                         (let [n (map (fn [d]
                                                                                                                                                        (let [s (clojure.string/split (:name d) #"\.")
                                                                                                                                                              fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                                              new (io/encode fr s)]
                                                                                                                                                          (println (byte-streams/convert new String))
                                                                                                                                                          (assoc d :name (byte-streams/convert new String))))
                                                                                                                                                      data)]
                                                                                                                                           (println n)
                                                                                                                                           n))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}
                                                                                                                                      {:name "aaa" :type 3}]))

                                                                                                                                 [{:name www.baidu.com, :type 1} {:name www.google.com, :type 2} {:name aaa, :type 3}]
                                                                                                                                 (wwwbaiducom
                                                                                                                                   wwwgooglecom
                                                                                                                                   aaa
                                                                                                                                   {:name wwwbaiducom, :type 1} {:name wwwgooglecom, :type 2} {:name aaa, :type 3})
                                                                                                                                 03 77 77 77 05 62 61 69  64 75 03 63 6F 6D            .www.baidu.com
                                                                                                                                 00                                                     .
                                                                                                                                 00 01                                                  ..
                                                                                                                                 03 77 77 77 06 67 6F 6F  67 6C 65 03 63 6F 6D         .www.google.com

                                                                                                                                 00 02                                                  ..
                                                                                                                                 03 61 61 61                                            .aaa

                                                                                                                                 00 03                                                  ..
                                                                                                                                 => nil
                                                                                                                                 b
                                                                                                                                 => #object["[B" 0x191ccbe5 "[B@191ccbe5"]
                                                                                                                                 Loading src/clojure_dns/protocol.clj...
                                                                                                                                 CompilerException java.lang.RuntimeException: No such namespace: io, compiling:(/Users/lianshitw/Desktop/Clojure/clojure-dns/src/clojure_dns/protocol.clj:58:17)

                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 (*e)
                                                                                                                                 ClassCastException java.nio.charset.MalformedInputException cannot be cast to clojure.lang.IFn  user/eval9001 (form-init4834992123025318464.clj:1)
                                                                                                                                 *e
                                                                                                                                 =>
                                                                                                                                 #error{:cause "java.nio.charset.MalformedInputException cannot be cast to clojure.lang.IFn",
                                                                                                                                        :via [{:type java.lang.ClassCastException,
                                                                                                                                               :message "java.nio.charset.MalformedInputException cannot be cast to clojure.lang.IFn",
                                                                                                                                               :at [user$eval9001 invokeStatic "form-init4834992123025318464.clj" 1]}],
                                                                                                                                        :trace [[user$eval9001 invokeStatic "form-init4834992123025318464.clj" 1]
                                                                                                                                                [user$eval9001 invoke "form-init4834992123025318464.clj" 1]
                                                                                                                                                [clojure.lang.Compiler eval "Compiler.java" 7062]
                                                                                                                                                [clojure.lang.Compiler eval "Compiler.java" 7025]
                                                                                                                                                [clojure.core$eval invokeStatic "core.clj" 3206]
                                                                                                                                                [clojure.core$eval invoke "core.clj" 3202]
                                                                                                                                                [clojure.main$repl$read_eval_print__8572$fn__8575 invoke "main.clj" 243]
                                                                                                                                                [clojure.main$repl$read_eval_print__8572 invoke "main.clj" 243]
                                                                                                                                                [clojure.main$repl$fn__8581 invoke "main.clj" 261]
                                                                                                                                                [clojure.main$repl invokeStatic "main.clj" 261]
                                                                                                                                                [clojure.main$repl doInvoke "main.clj" 177]
                                                                                                                                                [clojure.lang.RestFn invoke "RestFn.java" 1523]
                                                                                                                                                [clojure.tools.nrepl.middleware.interruptible_eval$evaluate$fn__1117 invoke "interruptible_eval.clj" 87]
                                                                                                                                                [clojure.lang.AFn applyToHelper "AFn.java" 152]
                                                                                                                                                [clojure.lang.AFn applyTo "AFn.java" 144]
                                                                                                                                                [clojure.core$apply invokeStatic "core.clj" 657]
                                                                                                                                                [clojure.core$with_bindings_STAR_ invokeStatic "core.clj" 1965]
                                                                                                                                                [clojure.core$with_bindings_STAR_ doInvoke "core.clj" 1965]
                                                                                                                                                [clojure.lang.RestFn invoke "RestFn.java" 425]
                                                                                                                                                [clojure.tools.nrepl.middleware.interruptible_eval$evaluate invokeStatic "interruptible_eval.clj" 85]
                                                                                                                                                [clojure.tools.nrepl.middleware.interruptible_eval$evaluate invoke "interruptible_eval.clj" 55]
                                                                                                                                                [clojure.tools.nrepl.middleware.interruptible_eval$interruptible_eval$fn__1162$fn__1165
                                                                                                                                                 invoke
                                                                                                                                                 "interruptible_eval.clj"
                                                                                                                                                 222]
                                                                                                                                                [clojure.tools.nrepl.middleware.interruptible_eval$run_next$fn__1157 invoke "interruptible_eval.clj" 190]
                                                                                                                                                [clojure.lang.AFn run "AFn.java" 22]
                                                                                                                                                [java.util.concurrent.ThreadPoolExecutor runWorker "ThreadPoolExecutor.java" 1142]
                                                                                                                                                [java.util.concurrent.ThreadPoolExecutor$Worker run "ThreadPoolExecutor.java" 617]
                                                                                                                                                [java.lang.Thread run "Thread.java" 745]]}
                                                                                                                                 (def pr
                                                                                                                                   (compile-frame
                                                                                                                                     (ordered-map :transaction-id :uint16
                                                                                                                                                  :flags flags-frame

                                                                                                                                                  ;; Automatically populate this field
                                                                                                                                                  :query-rrs :uint16
                                                                                                                                                  :answer-rrs :uint16
                                                                                                                                                  :authority-rrs :uint16
                                                                                                                                                  :additional-rrs :uint16

                                                                                                                                                  :query (repeated query-field :prefix :none)
                                                                                                                                                  ;:answers (repeated rr-field :prefix :none)
                                                                                                                                                  ;:authoritative (repeated rr-field :prefix :none)
                                                                                                                                                  ;:additional (repeated rr-field :prefix :none)
                                                                                                                                                  )
                                                                                                                                     fn-encode
                                                                                                                                     fn-decode))
                                                                                                                                 => #'user/pr
                                                                                                                                 (decode pr b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 {:transaction-id 54067, :flags {:qr true, :opcode 0, :aa true, :tc false, :rd true, :ra true, :fill 0, :rcode 0}, :query-rrs 1, :answer-rrs 2, :authority-rrs 0, :additional-rrs 0}
                                                                                                                                 Exception Bytes left over after decoding frame.  gloss.io/decode (io.clj:87)
                                                                                                                                 (byte-streams/print-bytes b)
                                                                                                                                 D3 33 85 80 00 01 00 02  00 00 00 00 03 77 77 77      Ó3...........www
                                                                                                                                 05 62 61 69 64 75 03 63  6F 6D 00 00 01 00 01 C0      .baidu.com.....À
                                                                                                                                 0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AC C0      ........X...èç.À
                                                                                                                                 0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AD         ........X...èç.
                                                                                                                                 => nil
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (byte-streams/print-bytes b)
                                                                                                                                 D3 33 85 80 00 01 00 02  00 00 00 00 03 77 77 77      Ó3...........www
                                                                                                                                 05 62 61 69 64 75 03 63  6F 6D 00 00 01 00 01 C0      .baidu.com.....À
                                                                                                                                 0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AC C0      ........X...èç.À
                                                                                                                                 0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AD         ........X...èç.
                                                                                                                                 => nil
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 {:transaction-id 54067, :flags {:qr true, :opcode 0, :aa true, :tc false, :rd true, :ra true, :fill 0, :rcode 0}, :query-rrs 1, :answer-rrs 2, :authority-rrs 0, :additional-rrs 0}
                                                                                                                                 Exception Bytes left over after decoding frame.  gloss.io/decode (io.clj:87)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 {:transaction-id 54067, :flags {:qr true, :opcode 0, :aa true, :tc false, :rd true, :ra true, :fill 0, :rcode 0}, :query-rrs 1, :answer-rrs 2, :authority-rrs 0, :additional-rrs 0}
                                                                                                                                 Exception Bytes left over after decoding frame.  gloss.io/decode (io.clj:87)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 IllegalArgumentException No implementation of method: :read-bytes of protocol: #'gloss.core.protocols/Reader found for class: clojure.lang.Keyword  clojure.core/-cache-protocol-fn (core_deftype.clj:583)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 UnsupportedCharsetException ubyte  java.nio.charset.Charset.forName (Charset.java:531)
                                                                                                                                 Loading src/clojure_dns/protocol.clj...
                                                                                                                                 CompilerException clojure.lang.ArityException: Wrong number of args (3) passed to: core/repeat, compiling:(protocol.clj:88:24)

                                                                                                                                 (decode protocol b)
                                                                                                                                 UnsupportedCharsetException ubyte  java.nio.charset.Charset.forName (Charset.java:531)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 Exception Insufficient bytes to decode frame.  gloss.io/decode (io.clj:85)
                                                                                                                                 Loading src/clojure_dns/protocol.clj...
                                                                                                                                 CompilerException java.lang.IllegalArgumentException: No value supplied for key: 4, compiling:(protocol.clj:88:24)

                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 {:transaction-id 54067, :flags {:qr true, :opcode 0, :aa true, :tc false, :rd true, :ra true, :fill 0, :rcode 0}, :query-rrs 1, :answer-rrs 2, :authority-rrs 0, :additional-rrs 0, :test www}
                                                                                                                                 Exception Bytes left over after decoding frame.  gloss.io/decode (io.clj:87)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 {:transaction-id 54067, :flags {:qr true, :opcode 0, :aa true, :tc false, :rd true, :ra true, :fill 0, :rcode 0}, :query-rrs 1, :answer-rrs 2, :authority-rrs 0, :additional-rrs 0, :test wwwbaidu}
                                                                                                                                 Exception Bytes left over after decoding frame.  gloss.io/decode (io.clj:87)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 (byte-streams/print-bytes b)
                                                                                                                                 D3 33 85 80 00 01 00 02  00 00 00 00 03 77 77 77      Ó3...........www
                                                                                                                                 05 62 61 69 64 75 03 63  6F 6D 00 00 01 00 01 C0      .baidu.com.....À
                                                                                                                                 0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AC C0      ........X...èç.À
                                                                                                                                 0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AD         ........X...èç.
                                                                                                                                 => nil
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (byte-streams/print-bytes b)
                                                                                                                                 D3 33 85 80 00 01 00 02  00 00 00 00 03 77 77 77      Ó3...........www
                                                                                                                                 05 62 61 69 64 75 03 63  6F 6D 00 00 01 00 01 C0      .baidu.com.....À
                                                                                                                                 0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AC C0      ........X...èç.À
                                                                                                                                 0C 00 01 00 01 00 00 02  58 00 04 B7 E8 E7 AD         ........X...èç.
                                                                                                                                 => nil
                                                                                                                                 (decode protocol b)
                                                                                                                                 {:transaction-id 54067, :flags {:qr true, :opcode 0, :aa true, :tc false, :rd true, :ra true, :fill 0, :rcode 0}, :query-rrs 1, :answer-rrs 2, :authority-rrs 0, :additional-rrs 0, :test wwwbaiducom }
                                                                                                                                 Exception Bytes left over after decoding frame.  gloss.io/decode (io.clj:87)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 {:transaction-id 54067, :flags {:qr true, :opcode 0, :aa true, :tc false, :rd true, :ra true, :fill 0, :rcode 0}, :query-rrs 1, :answer-rrs 2, :authority-rrs 0, :additional-rrs 0, :test www}
                                                                                                                                 Exception Bytes left over after decoding frame.  gloss.io/decode (io.clj:87)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 (decode protocol b)
                                                                                                                                 MalformedInputException Input length = 1  java.nio.charset.CoderResult.throwException (CoderResult.java:281)
                                                                                                                                 Loading src/clojure_dns/protocol.clj... done
                                                                                                                                 (decode protocol b)
                                                                                                                                 {:transaction-id 54067, :flags {:qr true, :opcode 0, :aa true, :tc false, :rd true, :ra true, :fill 0, :rcode 0}, :query-rrs 1, :answer-rrs 2, :authority-rrs 0, :additional-rrs 0, :test wwwbaiducom }
                                                                                                                                 Exception Bytes left over after decoding frame.  gloss.io/decode (io.clj:87)
                                                                                                                                 (byte-streams/print-bytes
                                                                                                                                   (io/encode
                                                                                                                                     (compile-frame
                                                                                                                                       (repeated
                                                                                                                                         (ordered-map :name (string :ascii :suffix "\0")
                                                                                                                                                      :type :uint16-be)
                                                                                                                                         :prefix :none)
                                                                                                                                       (fn [data]
                                                                                                                                         (println data)
                                                                                                                                         (let [n (map (fn [d]
                                                                                                                                                        (let [s (clojure.string/split (:name d) #"\.")
                                                                                                                                                              fr (repeated (string :ascii :prefix :ubyte) :prefix :none)
                                                                                                                                                              new (io/encode fr s)]
                                                                                                                                                          (println (byte-streams/convert new String))
                                                                                                                                                          (assoc d :name (byte-streams/convert new String))))
                                                                                                                                                      data)]
                                                                                                                                           (println n)
                                                                                                                                           n))
                                                                                                                                       (fn [data] data))
                                                                                                                                     [{:name "www.baidu.com" :type 1}
                                                                                                                                      {:name "www.google.com" :type 2}
                                                                                                                                      {:name "aaa" :type 3}]))
                                                                                                                                 [{:name www.baidu.com, :type 1} {:name www.google.com, :type 2} {:name aaa, :type 3}]
                                                                                                                                 (wwwbaiducom
                                                                                                                                   wwwgooglecom
                                                                                                                                   aaa
                                                                                                                                   {:name wwwbaiducom, :type 1} {:name wwwgooglecom, :type 2} {:name aaa, :type 3})
                                                                                                                                 03 77 77 77 05 62 61 69  64 75 03 63 6F 6D            .www.baidu.com
                                                                                                                                 00                                                     .
                                                                                                                                 00 01                                                  ..
                                                                                                                                 03 77 77 77 06 67 6F 6F  67 6C 65 03 63 6F 6D         .www.google.com

                                                                                                                                 00 02                                                  ..
                                                                                                                                 03 61 61 61                                            .aaa

                                                                                                                                 00 03                                                  ..
                                                                                                                                 => nil
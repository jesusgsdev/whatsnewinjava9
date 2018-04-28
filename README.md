[![Build Status](https://travis-ci.org/jesusgsdev/whatsnewinjava9.svg?branch=master)](https://travis-ci.org/jesusgsdev/whatsnewinjava9)
# What's new in Java 9?

## Prerequisites
You must have installed at least Java version 9.0.4 on your system in order to run this project. 
Link here: http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html

If you want to know how to install several Java versions in your MacOS system please
checkout this guide: https://gist.github.com/ntamvl/5f4dbaa8f68e6897b99682a395a44c2e

## Collections

Initialize a List, Set or Map with less verbosity:

- `List.of(v1, v2, v3, ...)`
- `Set.of(v1, v2, v3, ...)`
- `Map.of(k1, v1, k2, v2, ...)` or `MapEntries.of(Map.Entry(k,v), ...)`


## Streams
New methods:
- `Stream<T> takeWhile(Predicate<? super T> predicate)`
- `Stream<T> dropWhile(Predicate<? super T> predicate)`
- `<T> Stream<T> ofNullable(T t)`
- `Stream<String> lines(Path path) throws IOException`

New collectors methods:
- `<T, A, R> Collector<T, ?, R> filtering(Predicate<? super T> predicate, Collector<? super T, A, R> downstream)`
- `<T, U, A, R> Collector<T, ?, R> flatMapping(Function<? super T, ? extends Stream<? extends U>> mapper, Collector<? super U, A, R> downstream)`

## Optionals

Additions to Optional:

- `void ifPresentOrElse(Consumer<T> action, Runnable emptyAction)`
- `Optional<T> or(Supplier<Optional<T>> supplier)`
- `Stream<T> stream()`

## Interfaces

Support for private methods within an interface. Checkout `PricedObject` and `InterfaceReviewTest` tests.

## LocalDate

Additions to LocalDate:

- `Stream<LocalDate> datesUntil(LocalDate endExclusive, Period step)`

## Process and ProcessHandle

Extra classes to help managing process either created by Java or on the system.
Examples of methods like:

- `ProcessHandle.current().pid()`
- `ProcessHandle.allProcesses()`

## Flow API
Provide interoperability for reactive projects like RxJava 2, Akka Streams and Spring 5.

- `java.util.concurrent.Flow`

There is no examples in the code for this API.

## StackWalker

It's a new stack inspection API. 
Allows to handle specific StackFrames. There is not examples in the code.

## Performance and Security Enhancements

- G1 Garbage Collector default on Java 9
    - Eden, Survivor and Tenured region within the Heap
- String Performance
    - Compact Strings: Lower memory usage and effective immediately without code changes
    - String concatenation changes: Change concatenation translation strategy
- Serialization
    - Filter data before deserializing
- TLS improvements: ALPN
    - ALPN: Application Layer Protocol Negotiation
    - Allows to select application layer protocol during TLS handshake
    - DTLS 1.0/1.2: Datagram Transport Layer Security aligned with TLS 1.1/1.2
    - OCSP Stapling: Online Certificate Status Protocol
- SHA-1 Certificates Disabled
    - SHA-1 is broken by collision attacks. Certificates using SHA-1 will be rejected
    - SHA-3 support was added
    
There is no examples in the code for this improvements as they apply if you compile with Java 9.


### References

- Java 9 Optional API Additions: http://www.baeldung.com/java-9-optional
- What's new in Java 9: https://pluralsight.com/library/courses/java-9-whats-new
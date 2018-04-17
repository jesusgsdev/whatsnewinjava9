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

### References

- Java 9 Optional API Additions: http://www.baeldung.com/java-9-optional
- What's new in Java 9: https://app.pluralsight.com/library/courses/java-9-whats-new
[![Build Status](https://travis-ci.org/jesusgsdev/whatsnewinjava9.svg?branch=master)](https://travis-ci.org/jesusgsdev/whatsnewinjava9)
# What's new in Java 9?

## Prerequisites
You must have installed Java 9.0.1 on your system in order to run this project. 
Link here: http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html

If you want to know how to install several Java version in your MacOS system please
checkout this guide: https://gist.github.com/ntamvl/5f4dbaa8f68e6897b99682a395a44c2e

## Collections

Initialize a List, Set or Map with less verbosity:

- `List.of(v1, v2, v3, ...)`
- `Set.of(v1, v2, v3, ...)`
- `Map.of(k1, v1, k2, v2, ...)` or `MapEntries.of(Map.Entry(k,v), ...)`


## Streams
New methods:
- `default Stream<T> takeWhile(Predicate<? super T> predicate)`
- `default Stream<T> dropWhile(Predicate<? super T> predicate)`
- `public static<T> Stream<T> ofNullable(T t)`
[![Build Status](https://travis-ci.org/jesusgsdev/whatsnewinjava9.svg?branch=master)](https://travis-ci.org/jesusgsdev/whatsnewinjava9)
# What's new in Java 9?

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
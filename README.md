[![Build Status](https://travis-ci.org/jesusgsdev/whatsnewinjava9.svg?branch=master)](https://travis-ci.org/jesusgsdev/whatsnewinjava9)
# What's new in Java 9?

## Collections

Initialize a List, Set or Map with less verbosity:

- `List.of(...)`
- `Set.of(...)`
- `Map.of(k1, v1, k2, v2, ...)` or `MapEntries.of(Map.Entry(k,v), ...)`


## Streams
New methods:
- `default Stream<T> takeWhile(Predicate<? super T> predicate)`
- `default Stream<T> dropWhile(Predicate<? super T> predicate)`

package com.jesusgsdev.enhancements;


import java.util.Optional;
import java.util.stream.Stream;

public class OptionalReview {

    public static <T>Stream<T> usingStreamOnOptional(Stream<Optional<T>> optionals){
        return optionals.flatMap(Optional::stream);
    }

}

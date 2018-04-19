package com.jesusgsdev;


import java.util.stream.Stream;

public class StreamsReview {

    /**
     * Returns, if this stream is ordered, a stream consisting of the longest
     * prefix of elements taken from this stream that match the given predicate.
     * Otherwise returns, if this stream is unordered, a stream consisting of a
     * subset of elements taken from this stream that match the given predicate.
     * @param colours
     * @param colour
     * @return
     */
    public static Stream<String> newMethodTakeWhile(final Stream<String> colours, final String colour){
        return colours.takeWhile(c -> colour.equals(c));
    }

    /**
     * Returns, if this stream is ordered, a stream consisting of the remaining
     * elements of this stream after dropping the longest prefix of elements
     * that match the given predicate.  Otherwise returns, if this stream is
     * unordered, a stream consisting of the remaining elements of this stream
     * @param colours
     * @param colour
     * @return
     */
    public static Stream<String> newMethodDropWhile(final Stream<String> colours, final String colour){
        return colours.dropWhile(c -> colour.equals(c));
    }

}

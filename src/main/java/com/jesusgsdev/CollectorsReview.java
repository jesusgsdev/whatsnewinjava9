package com.jesusgsdev;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class CollectorsReview {

    /**
     * Collect all books costing more than 10, grouped by author(s)
     * @param books
     * @return
     */
    public static Map<Set<String>, Set<Book>> getBooksByAuthorUsingFiltering(Stream<Book> books) {
        return books.collect(
                        groupingBy(Book::getAuthors,
                            filtering(b -> b.getPrice() > 10, toSet())
                        )
        );
    }

    /**
     * Collect all authors that sell books at a given price
     * @param books
     * @return
     */
    public static Map<Double, Set<String>> getAuthorSellingForPriceUsingFlatMapping(Stream<Book> books) {
        return books.collect(
                        groupingBy(Book::getPrice,
                                flatMapping(b -> b.getAuthors().stream(), toSet())
                        )
                );
    }
}

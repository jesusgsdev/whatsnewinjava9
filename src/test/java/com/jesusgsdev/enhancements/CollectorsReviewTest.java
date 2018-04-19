package com.jesusgsdev.enhancements;

import com.jesusgsdev.enhancements.CollectorsReview;
import com.jesusgsdev.enhancements.helpers.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Test of CollectorsReview methods")
public class CollectorsReviewTest {

    @Test
    @DisplayName("Usage of the method filtering of Stream")
    public void testNewMethodTakeWhile(){
        //Given
        Stream<Book> books = Book.getBooks();

        //When
        Map<Set<String>, Set<Book>> booksByAuthors = CollectorsReview.getBooksByAuthorUsingFiltering(books);

        //Then
        assertEquals(1, booksByAuthors.size());
        assertEquals(2, booksByAuthors.keySet().stream().findFirst().get().size());
        assertTrue(booksByAuthors.keySet().stream().findFirst().get().stream().anyMatch(a -> "Author A".equals(a)));
        assertTrue(booksByAuthors.keySet().stream().findFirst().get().stream().anyMatch(a -> "Author B".equals(a)));
    }

    @Test
    @DisplayName("Usage of the method flatMapping of Stream")
    public void testNewMethodDropWhile(){
        //Given
        Stream<Book> books = Book.getBooks();

        //When
        Map<Double, Set<String>> authorsSellingForPrice = CollectorsReview.getAuthorSellingForPriceUsingFlatMapping(books);

        //Then
        assertEquals(1, authorsSellingForPrice.size());
        assertTrue(authorsSellingForPrice.keySet().stream().findFirst().get() == 20D);
        assertEquals(2, authorsSellingForPrice.values().stream().findFirst().get().size());
        assertTrue(authorsSellingForPrice.values().stream().findFirst().get().stream().anyMatch(a -> "Author A".equals(a)));
        assertTrue(authorsSellingForPrice.values().stream().findFirst().get().stream().anyMatch(a -> "Author B".equals(a)));
    }


}

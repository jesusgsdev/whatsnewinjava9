package com.jesusgsdev;

import com.jesusgsdev.helpers.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test of Interface improvements")
public class InterfaceReviewTest {

    @Test
    @DisplayName("Testing getPriceWithTax() being a default method in an interface that has a private method too")
    public void testNewMethodTakeWhile(){
        //Given
        Book book = Book.getBook();

        //When
        double priceWithTax = book.getPriceWithTax();

        //Then
        assertEquals(book.getPrice() * 1.21, priceWithTax);
    }

    @Test
    @DisplayName("Testing getOfferPrice() being a default method in an interface that has a private method too")
    public void testNewMethodDropWhile(){
        //Given
        Book book = Book.getBook();

        //When
        double priceWithDiscount = book.getOfferPrice(0.9);

        //Then
        assertEquals(book.getPrice() * 1.21 * 0.9, priceWithDiscount);
    }

}

package com.jesusgsdev.enhancements;

import com.jesusgsdev.enhancements.OfNullableReview;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Test of OfNullableReview methods")
public class OfNullableReviewTest {

    @Test
    @DisplayName("Usage of ofNullable when the object is not null")
    public void testCreateListOfElements(){
        //Given

        //When
        Stream<String> authors = OfNullableReview.exampleOfNullableWhenBookIsNotNull();

        //Then
        List<String> authorsList = authors.collect(Collectors.toList());
        assertEquals(2, authorsList.size());
        assertTrue(authorsList.contains("Author A"));
        assertTrue(authorsList.contains("Author B"));
    }

    @Test
    @DisplayName("Usage of ofNullable when the object is null")
    public void testCreateSetOfElements(){
        //Given

        //When
        Stream<String> authors = OfNullableReview.exampleOfNullableWhenBookIsNull();

        //Then
        List<String> authorsList = authors.collect(Collectors.toList());
        assertTrue(authorsList.isEmpty());
    }


}

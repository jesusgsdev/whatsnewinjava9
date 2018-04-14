package com.jesusgsdev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test of CollectionsReview methods")
public class CollectionsReviewTest {

    @Test
    @DisplayName("CreateListOfElements")
    public void testCreateListOfElements(){
        //Given
        List<Integer> oldList = Arrays.asList(1,2,3);

        //When
        List<Integer> integerList = CollectionsReview.createListOfElements();

        //Then
        assertEquals(oldList, integerList);
    }

    @Test
    @DisplayName("CreateSetOfElements")
    public void testCreateSetOfElements(){
        //Given
        Set<Integer> oldSet = new HashSet<>(Arrays.asList(1,2,3));

        //When
        Set<Integer> integersSet = CollectionsReview.createSetOfElements();

        //Then
        assertEquals(oldSet, integersSet);
    }

    @Test
    @DisplayName("CreateMapOfElementsFirstWay")
    public void testCreateMapOfElementsFirstWay(){
        //Given
        Map<String, Integer> oldMap = new HashMap<>();
        oldMap.put("One", 1);
        oldMap.put("Two", 2);
        oldMap.put("Three", 3);

        //When
        Map<String, Integer> stringIntegerMap = CollectionsReview.createMapOfKeysAndValues();

        //Then
        assertEquals(oldMap, stringIntegerMap);
    }


    @Test
    @DisplayName("CreateMapOfElementsSecondWay")
    public void testCreateMapOfElementsSecondWay(){
        //Given
        Map<String, Integer> oldMap = new HashMap<>();
        oldMap.put("One", 1);
        oldMap.put("Two", 2);
        oldMap.put("Three", 3);

        //When
        Map<String, Integer> stringIntegerMap = CollectionsReview.createMapOfKeysAndValuesSecondWay();

        //Then
        assertEquals(oldMap, stringIntegerMap);
    }

}

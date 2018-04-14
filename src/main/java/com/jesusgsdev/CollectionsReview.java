package com.jesusgsdev;

import java.util.*;

public class CollectionsReview {

    public static List<Integer> createListOfElements(){
        //Old way on Java 8
        List<Integer> oldList = Arrays.asList(1,2,3);

        //New way on Java 9
        List<Integer> newList = List.of(1,2,3);
        return newList;
    }

    public static Set<Integer> createSetOfElements(){
        //Old way on Java 8
        Set<Integer> oldSet = new HashSet<>(Arrays.asList(1,2,3));

        //New way on Java 9
        Set<Integer> newSet = Set.of(1,2,3);

        return newSet;
    }

    public static Map<String, Integer> createMapOfKeysAndValues(){
        //Old way on Java 8
        Map<String, Integer> oldMap = new HashMap<>();
        oldMap.put("One", 1);
        oldMap.put("Two", 2);
        oldMap.put("Three", 3);

        //New way on Java 9
        Map<String, Integer> newMap = Map.ofEntries(Map.entry("One", 1), Map.entry("Two", 2), Map.entry("Three", 3));

        return newMap;
    }

    public static Map<String, Integer> createMapOfKeysAndValuesSecondWay(){
        //Old way on Java 8
        Map<String, Integer> oldMap = new HashMap<>();
        oldMap.put("One", 1);
        oldMap.put("Two", 2);
        oldMap.put("Three", 3);

        //New way on Java 9
        //Map.of supports up to 10 key value pairs
        Map<String, Integer> newMap = Map.of("One", 1,"Two", 2, "Three", 3);

        return newMap;
    }

}

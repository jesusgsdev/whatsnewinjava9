package com.jesusgsdev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Test of OptionalReview methods")
public class OptionalReviewTest {

    @Test
    @DisplayName("Usage of the method stream() on a Optional object")
    public void testStreamOnOptionalObject(){
        //Given
        Stream<Optional<Integer>> numbers = Stream.of(Optional.of(1), Optional.empty(), Optional.of(2));

        //When
        Stream<Integer> numbersFound = OptionalReview.usingStreamOnOptional(numbers);

        //Then
        List<Integer> numbersAsList = numbersFound.collect(Collectors.toList());
        assertEquals(2, numbersAsList.size()); //Because there is only 2 non empty optional objects
        assertTrue(numbersAsList.contains(1));
        assertTrue(numbersAsList.contains(2));
    }

    @Test
    @DisplayName("Usage of the method ifPresentOrElse on an Optional object")
    public void givenOptionalWhenPresentThenShouldExecuteProperCallback() {
        //Given
        Optional<String> value = Optional.of("properValue");
        AtomicInteger successCounter = new AtomicInteger(0);
        AtomicInteger onEmptyOptionalCounter = new AtomicInteger(0);

        //When
        value.ifPresentOrElse(v -> successCounter.incrementAndGet(), onEmptyOptionalCounter::incrementAndGet);

        //Then
        assertEquals(1, successCounter.get());
        assertEquals(0, onEmptyOptionalCounter.get());
    }

    @Test
    @DisplayName("Usage of the method ifPresentOrElse on an Optional empty object")
    public void givenOptionalWhenNotPresentThenShouldExecuteProperCallback() {
        //Given
        Optional<String> value = Optional.empty();
        AtomicInteger successCounter = new AtomicInteger(0);
        AtomicInteger onEmptyOptionalCounter = new AtomicInteger(0);

        //When
        value.ifPresentOrElse(v -> successCounter.incrementAndGet(), onEmptyOptionalCounter::incrementAndGet);

        //Then
        assertEquals(0, successCounter.get());
        assertEquals(1, onEmptyOptionalCounter.get());
    }

    @Test
    @DisplayName("Usage of the method or on an Optional object")
    public void givenOptionalWhenPresentThenShouldTakeAValueFromIt() {
        //Given
        String expected = "properValue";
        Optional<String> value = Optional.of(expected);
        Optional<String> defaultValue = Optional.of("default");

        //When
        Optional<String> result = value.or(() -> defaultValue);

        //Then
        assertEquals(expected, result.get());
    }

    @Test
    @DisplayName("Usage of the method or on an Optional empty object")
    public void givenOptionalWhenNotPresentThenShouldTakeAValueFromIt() {
        //Given
        Optional<String> value = Optional.empty();
        Optional<String> defaultValue = Optional.of("default");

        //When
        Optional<String> result = value.or(() -> defaultValue);

        //Then
        assertEquals("default", result.get());
    }

}

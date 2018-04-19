package com.jesusgsdev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Test of OptionalReview methods")
public class LocalDateReviewTest {

    @Test
    @DisplayName("Usage of the method datesUntil(LocalDate endDate) on a LocalDate object")
    public void testGetDatesInBetweenTwo(){
        //Given
        LocalDate today = LocalDate.now();
        LocalDate inTenDays = today.plusDays(10);

        //When
        Stream<LocalDate> datesBetweenTodayAndIn10Days = LocalDateReview.getDatesInBetweenTwo(today, inTenDays);

        //Then
        List<LocalDate> datesList = datesBetweenTodayAndIn10Days.collect(Collectors.toList());
        assertEquals(10, datesList.size());
        //Checking manually one by one that there are the 10 we want
        IntStream.range(0, 10).forEach( i -> assertTrue(datesList.contains(today.plusDays(i))));
    }

    @Test
    @DisplayName("Usage of the method datesUntil(LocalDate endDate) to count Leap years since my birthday")
    public void testGetLeapYearsSinceMyBirthday(){
        //Given
        LocalDate myBirthday = LocalDate.of(1989, 2, 2);

        //When
        long numberOfLeapYearsSinceMyBirthday = LocalDateReview.getLeapYearsSinceMyBirthday(myBirthday);

        //Then
        assertEquals(7, numberOfLeapYearsSinceMyBirthday);
    }
}

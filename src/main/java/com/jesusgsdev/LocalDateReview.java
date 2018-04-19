package com.jesusgsdev;


import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Optional;
import java.util.stream.Stream;

public class LocalDateReview {

    public static Stream<LocalDate> getDatesInBetweenTwo(LocalDate startDate, LocalDate endDate){
        return startDate.datesUntil(endDate);
    }

    public static long getLeapYearsSinceMyBirthday(LocalDate myBirthday){
        return myBirthday.datesUntil(LocalDate.now(), Period.ofYears(1)) //Getting the dates in period of 1 year
                .map(date -> Year.of(date.getYear())) //Extracting form the dates just the years
                .filter(Year::isLeap) //Filtering only the Leap years
                .count(); //Counting them
    }

}

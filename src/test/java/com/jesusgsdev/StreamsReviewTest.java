package com.jesusgsdev;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

@DisplayName("Test of StreamReview methods")
public class StreamsReviewTest {

    @Test
    @DisplayName("Usage of the method TakeWhile of Stream")
    public void testNewMethodTakeWhile(){
        //Given
        Stream<String> colours = Stream.of("Blue", "Blue", "Blue", "Red", "Red", "Green", "Green");

        //When
        Stream<String> blueColours = StreamsReview.newMethodTakeWhile(colours, "Blue");

        //Then
        assertTrue(blueColours.count() == 3L); //Because there is only 3 blues
    }

    @Test
    @DisplayName("Usage of the method DropWhile of Stream")
    public void testNewMethodDropWhile(){
        //Given
        Stream<String> colours = Stream.of("Blue", "Blue", "Blue", "Red", "Red", "Green", "Green");

        //When
        Stream<String> blueColours = StreamsReview.newMethodDropWhile(colours, "Blue");

        //Then
        assertTrue(blueColours.count() == 4L); //Because if we remove the Blue ones, 4 items remain
    }


}

package com.jesusgsdev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test of StreamReview methods")
public class FilesLinesReviewTest {

    @Test
    @DisplayName("Usage of the method Files.lines")
    public void testNewMethodTakeWhile() throws Exception {
        //Given
        String fileName = "resources/index.html";

        //When
        List<String> gitConflict = FilesLinesReview.getLinesOfGitConflict(fileName);

        //Then
        assertEquals(2, gitConflict.size()); //Two lines
        assertEquals("    <meta charset=\"UTF-8\">", gitConflict.get(0)); //Two lines
        assertEquals("    =======", gitConflict.get(1)); //Two lines
    }

}

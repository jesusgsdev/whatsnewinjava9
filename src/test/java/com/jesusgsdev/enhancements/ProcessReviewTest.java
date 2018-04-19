package com.jesusgsdev.enhancements;

import com.jesusgsdev.enhancements.ProcessReview;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.management.ManagementFactory;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Test of ProcessReview methods")
public class ProcessReviewTest {

    @Test
    @DisplayName("Usage of the method current().pid() of ProcessHandle")
    public void testGetProcessId(){
        //Given
        //Using old Java 8 way of getting it
        Long processIdFromJava8 = Long.parseLong(ManagementFactory.getRuntimeMXBean().getName().split("@")[0]);

        //When
        Long processId = ProcessReview.getProcessId();

        //Then
        assertEquals(processIdFromJava8, processId);
    }

    @Test
    @DisplayName("Usage of the method allProcesses() of ProcessHandle")
    public void testNewMethodTakeWhile(){
        //Given

        //When
        Stream<ProcessHandle> runningProcesses = ProcessReview.getRunningProcess();

        //Then
        assertTrue(runningProcesses.count() > 1L);
    }

}

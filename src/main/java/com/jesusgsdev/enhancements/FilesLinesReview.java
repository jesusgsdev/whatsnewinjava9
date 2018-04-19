package com.jesusgsdev.enhancements;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FilesLinesReview {

    public static List<String> getLinesOfGitConflict(String fileName) throws Exception {
        //Files.lines will return a Stream<String>
        return Files.lines(Paths.get(fileName))
                .dropWhile(l -> !l.contains("<<<<<<<")) //Remove all lines until find the <<<<<<<
                .skip(1)                                //Skip the line with <<<<<<<
                .takeWhile(l -> !l.contains(">>>>>>>")) //Get all the lines until the >>>>>>>
                .collect(Collectors.toList());
    }
}

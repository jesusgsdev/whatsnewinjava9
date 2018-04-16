package com.jesusgsdev;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesLinesReview {

    public static void main(String... args) throws Exception {
        //Files.lines will return a Stream<String>
        Files.lines(Paths.get("resources/index.html"))
                .dropWhile(l -> !l.contains("<<<<<<<")) //Remove all lines until find the <<<<<<<
                .skip(1)                                //Skip the line with <<<<<<<
                .takeWhile(l -> !l.contains(">>>>>>>")) //Get all the lines until the >>>>>>>
                .forEach(System.out::println);          //Print out the diff code found
    }
}

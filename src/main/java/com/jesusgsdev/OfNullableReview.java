package com.jesusgsdev;

import java.util.stream.Stream;

import static com.jesusgsdev.Book.getBook;

public class OfNullableReview {

    public void exampleOfNullableWhenBookIsNull(){
        //Before in Java 8
        //Get the Book as null
        Book book = getPossiblyNull(true);
        //Get an empty stream or a stream with authors depend on book is null or not
        Stream<String> authors = book == null ? Stream.empty() : book.authors.stream();
        //Print out the name of the authors
        authors.forEach(System.out::println);

        //Now in Java 9
        Stream.ofNullable(getPossiblyNull(true)) //Get a stream of objects or of a null
                .flatMap(b -> b.authors.stream()) //Flatmap the authors
                .forEach(System.out::println); //Print out the name of the authors
    }

    public void exampleOfNullableWhenBookIsNotNull(){
        //Before in Java 8
        //Get the book as not null
        Book book = getPossiblyNull(false);
        //Get an empty stream or a stream with authors depend on book is null or not
        Stream<String> authors = book == null ? Stream.empty() : book.authors.stream();
        //Print out the name of the authors
        authors.forEach(System.out::println);

        //Now in Java 9
        Stream.ofNullable(getPossiblyNull(false)) //Get a stream of objects or of a null
                .flatMap(b -> b.authors.stream()) //Flatmap the authors
                .forEach(System.out::println); //Print out the name of the authors
    }

    private Book getPossiblyNull(boolean isNull) {
        return isNull ? null : getBook();
    }

}
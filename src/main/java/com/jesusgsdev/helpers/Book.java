package com.jesusgsdev.helpers;

import java.util.Set;
import java.util.stream.Stream;

public class Book implements PricedObject {

    private final String title;
    private final Set<String> authors;
    private final double price;

    public Book(String title, Set<String> authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public Set<String> getAuthors() {
        return authors;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public static Book getBook(){
        return new Book("The Book Number One", Set.of("Author A", "Author B"), 20D);
    }

    public static Stream<Book> getBooks(){
        return Stream.of(getBook());
    }

}

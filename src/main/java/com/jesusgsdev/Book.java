package com.jesusgsdev;

import java.util.Set;
import java.util.stream.Stream;

public class Book implements PricedObject{

    public final String title;
    public final Set<String> authors;
    public final double price;

    public Book(String title, Set<String> authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public String getTitle() {
        return title;
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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", price=" + price +
                '}';
    }
}

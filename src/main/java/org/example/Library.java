package org.example;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Library:\n");
        for (Book book : books) {
            result.append(book).append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args){

        Book[] books = new Book[3];

        books[0] = new Book("Die Unendliche Geschichte", "Michael Ende", "xyz-0998877");
        books[1] = new Book("Der Herr der Ringe 1", "J.R.R. Tolkien", "zxy-65656775");
        books[2] = new Book("Der Herr der Ringe 2", "J.R.R. Tolkien", "zxy-65656778");

        Library library = new Library(books);

        System.out.println(library);
    }


}

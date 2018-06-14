package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;

class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static void main(String[] args) {

        LinkedList<Book> theBook = new LinkedList<Book>();
        for (int n = 0; n < 50000; n++) {
            theBook.add(new Book("Adam Mickiewicz " + n, "Pan Tadeusz "));
        }
        System.out.println(theBook);

        Book book = theBook.get(0);

        //Deleting first element from collecion
        long begin = System.nanoTime();
        theBook.remove(book);
        long end = System.nanoTime();

        //Displaying time of deletion
        System.out.println("Removing first element from collecion " + (end - begin) + " ns");

        Book book2 = theBook.get(theBook.size()-1);

        //Deleting last element from collecion
        begin = System.nanoTime();
        theBook.remove(book2);
        end = System.nanoTime();

        //Displaying time of deletion
        System.out.println("Removing firt element from collecion " + (end - begin) + " ns");

        //Adding element at the beginning of the collecion
        begin = System.nanoTime();
        theBook.add(0,new Book("Atystoteles", "Etyka Nikomachejska"));
        end = System.nanoTime();

        //Displaying time of operation
        System.out.println("Adding first element from collecion " + (end - begin) + " ns");

        //Adding element at the end of the collecion
        begin = System.nanoTime();
        theBook.add(new Book("Bruce Eckel", "Thinking in Java"));
        end = System.nanoTime();

        //Displaying time of operation
        System.out.println("Adding first element to collecion " + (end - begin) + " ns");

        HashMap<Integer, Book> theBook2 = new HashMap<Integer, Book>();
        for (int n = 0; n < 500000; n++) {
            theBook2.put(n, new Book("Platon " + n, "Państwo "));
        }
        System.out.println(theBook2);
        System.out.println("Element " + 100000 + " of theBook2 i " + theBook2.get(100000));

        //Adding element at the beginning of the collecion
        begin = System.nanoTime();
        theBook2.put(100000, new Book ("Arystoteles", "Metafizyka"));
        end = System.nanoTime();

        //Displaying time of operation
        System.out.println("Adding first element to collecion " + (end - begin) + " ns");

        //Deleting last element from collecion
        begin = System.nanoTime();
        theBook2.remove(theBook2.size() - 1);
        end = System.nanoTime();

        //Displaying time of deletion
        System.out.println("Removing last element from collecion " + (end - begin) + " ns");

    }

    public boolean equals(Object o) {
        final Book e = (Book) o;
        return this.author.equals(e.author) && this.title.equals(e.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(author, title);
    }
}
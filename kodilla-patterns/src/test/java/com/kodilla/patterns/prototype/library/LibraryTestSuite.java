package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {


    @Test
    public void testGetBooks() {
        //Given

        Library library = new Library("University Library");
        Book book1 = new Book("Encyklopedia", "JK", LocalDate.of(1999, 1, 1));
        Book book2 = new Book("Ciekawostki", "KO", LocalDate.of(2001, 6, 10));
        Book book3 = new Book("Instrukcja", "MR", LocalDate.of(2007, 9, 21));
        Book book4 = new Book("Elementarz", "PL", LocalDate.of(2018, 11, 30));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //shallowCopy

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cloned Library");

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //deepCopy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Cloned Library - deepClone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());


    }


}


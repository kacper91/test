package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;

    }

    @Test
    public void testListBooksWithConditionsReturnList() {

        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();

        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);

        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListofBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        Assert.assertEquals(4, theListofBooks.size());

    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBook0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBook15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBook40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //Then
        assertEquals(0, theListOfBook0.size());
        assertEquals(15, theListOfBook15.size());
        assertEquals(0, theListOfBook40.size());


    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBookInHandsOf0() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        List<Book> booksInHandOf = generateListOfNBooks(0);


        //When
        int booksOff = booksInHandOf.size(); //ksiazki wypozyczone
        if (booksOff == 0) {

            System.out.println("no books in hand off");
        }

        //Then
        Assert.assertEquals(0, booksOff);
    }

    @Test
    public void testListBookInHandsOf1book() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        resultListOfBooks.add(book1);

        //When
        int booksOff = resultListOfBooks.size(); //ksiazki wypozyczone

        //Then
        Assert.assertEquals(1, booksOff);
    }

    @Test
    public void testListBookInHandsOf5book() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book3 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book4 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book5 = new Book("Secrets of Alamo", "John Smith", 2008);

        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        resultListOfBooks.add(book5);

        //When
        int booksOff = resultListOfBooks.size(); //ksiazki wypozyczone

        //Then
        Assert.assertEquals(5, booksOff);
    }

}


package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();

        books.add(new Book("book1", "author1", 2001, "signature1"));
        books.add(new Book("book2", "author2", 2002, "signature2"));
        books.add(new Book("book3", "author3", 2003, "signature3"));
        books.add(new Book("book4", "author4", 2004, "signature4"));
        books.add(new Book("book5", "author5", 2005, "signature5"));

        //When
        int medianResult = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(2003, medianResult);
    }
}

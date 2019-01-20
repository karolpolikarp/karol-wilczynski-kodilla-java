package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("library0");
        Book book0 = new Book("title0", "author0", LocalDate.of(1990, 1, 10));
        Book book1 = new Book("title1", "author1", LocalDate.of(1995, 3, 12));
        Book book2 = new Book("title2", "author2", LocalDate.of(2006, 6, 28));

        library.getBooks().add(book0);
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library0 - shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("library0 - deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book2);
        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
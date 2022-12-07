package de.neuefische.excercisebooklibary.service;

import de.neuefische.excercisebooklibary.model.Book;
import de.neuefische.excercisebooklibary.model.Kind;
import de.neuefische.excercisebooklibary.repo.BooksRepo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class BooklibraryServiceTest {

    @Test
    void getBooks() {
        //given
        List<Book> bookList = new ArrayList<>(
                List.of(
                        new Book("01234","Buch der Bücher", "Alfred", Kind.HARDCOVER ),
                        new Book("04321","Buch der Bücher2", "Alfred", Kind.SOFTCOVER )
                )
        );


        BooksRepo booksRepo= mock(BooksRepo.class);
        when(booksRepo.getBooks()).thenReturn(bookList);

        //when
        BooklibraryService booklibraryService = new BooklibraryService(booksRepo);

        List<Book> actual = booklibraryService.getBooks();

        //then
        assertEquals(bookList, actual);
        verify(booksRepo).getBooks();

    }
}
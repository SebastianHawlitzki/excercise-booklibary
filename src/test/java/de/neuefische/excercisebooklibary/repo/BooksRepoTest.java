package de.neuefische.excercisebooklibary.repo;

import de.neuefische.excercisebooklibary.model.Book;
import de.neuefische.excercisebooklibary.model.Kind;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksRepoTest {

    @Test
    void getBooks_() {
        //given
        List<Book> books = new ArrayList<>();
        BooksRepo booksRepo = new BooksRepo(books);

        //when
        List<Book> actual = booksRepo.getBooks();

        //then
        assertEquals(books, actual);

    }

}
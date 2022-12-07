package de.neuefische.excercisebooklibary.service;

import de.neuefische.excercisebooklibary.model.Book;
import de.neuefische.excercisebooklibary.repo.BooksRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BooklibraryService {

private final BooksRepo booksRepo;

    public List<Book> getBooks() {
        return booksRepo.getBooks();
    }

    public Book getBookByISBN(String isbn ) {
        return booksRepo.getBookByISBN(isbn);
    }

    public Book addBook(Book book) {
        return booksRepo.addBook(book);
    }
}

package de.neuefische.excercisebooklibary.controller;


import de.neuefische.excercisebooklibary.model.Book;
import de.neuefische.excercisebooklibary.service.BooklibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor

public class BooklibraryController {

    private final BooklibraryService booklibraryService;

    // GET/books liefert alle gespeicherten Bücher
    @GetMapping
    public List<Book> getBooks() {
        return booklibraryService.getBooks();
    }

    // GET/books/0345391802 liefert das Buch mit der ISBN 0345391802
    @GetMapping("{isbn}")
    public Book getBookByISBN(@PathVariable String isbn) {
        return booklibraryService.getBookByISBN(isbn);
    }

    //PUT/books/0345391802 um ein Buch abzuspeichern
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return booklibraryService.addBook(book);


    }
}

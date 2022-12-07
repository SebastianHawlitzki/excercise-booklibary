package de.neuefische.excercisebooklibary.repo;

import de.neuefische.excercisebooklibary.model.Book;
import de.neuefische.excercisebooklibary.model.Kind;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
@AllArgsConstructor
@NoArgsConstructor


public class BooksRepo {
    List<Book> books = new ArrayList<>(
            List.of(
                    new Book("0345391802", "Das Buch 1", "Sebastian", Kind.HARDCOVER),
                    new Book("0647201111", "Das Buch 2", "Max Muster", Kind.SOFTCOVER),
                    new Book("0886023242", "Das Buch 3", "Siegfried", Kind.EBOOK),
                    new Book("0123452345", "Das Buch 4", "Alex", Kind.SOFTCOVER),
                    new Book("0987654432", "Das Buch 5", "Olga", Kind.HARDCOVER)

            )
            );



    // GET/books liefert alle gespeicherten Bücher
    public List<Book> getBooks() {
        return books;
    }

    // GET/books/0345391802 liefert das Buch mit der ISBN 0345391802
    public Book getBookByISBN(String isbn ) {
        Book book = null;

        for (Book b: books) {
            if (b.getIsbn() == isbn) {
                book = b;
                break;
            }
        }

        return book;
    }





    //PUT/books/0345391802 um ein Buch abzuspeichern

    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    //DELETE/books/0345391802 löscht das Buch (z.B. wenn man es verschenkt

    //public Book deleteBook (Book book){

   // }


}

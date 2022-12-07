package de.neuefische.excercisebooklibary.repo;

import de.neuefische.excercisebooklibary.model.Book;
import de.neuefische.excercisebooklibary.model.Kind;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class BooksRepo {
    List<Book> books = new ArrayList<>(
            List.of(
                    new Book("099867", "Das Buch 1", "Sebastian Hawlitzki", Kind.HARDCOVER),
                    new Book("064720", "Das Buch 2", "Sebastian Hawlitzki", Kind.SOFTCOVER),
                    new Book("088602", "Das Buch 3", "Sebastian Hawlitzki", Kind.EBOOK),
                    new Book("012345", "Das Buch 4", "Sebastian Hawlitzki", Kind.SOFTCOVER),
                    new Book("098765", "Das Buch 5", "Sebastian Hawlitzki", Kind.HARDCOVER)

            )
            );

}

package de.neuefische.excercisebooklibary.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext
class BooklibraryControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void getBooks() throws Exception {
        //Given

        String expectedJson = """
                         [
                             {
                                 "isbn": "0345391802",
                                 "title": "Das Buch 1",
                                 "author": "Sebastian",
                                 "kind": "HARDCOVER"
                             },
                             {
                                 "isbn": "0647201111",
                                 "title": "Das Buch 2",
                                 "author": "Max Muster",
                                 "kind": "SOFTCOVER"
                             },
                             {
                                 "isbn": "0886023242",
                                 "title": "Das Buch 3",
                                 "author": "Siegfried",
                                 "kind": "EBOOK"
                             },
                             {
                                 "isbn": "0123452345",
                                 "title": "Das Buch 4",
                                 "author": "Alex",
                                 "kind": "SOFTCOVER"
                             },
                             {
                                 "isbn": "0987654432",
                                 "title": "Das Buch 5",
                                 "author": "Olga",
                                 "kind": "HARDCOVER"
                             }
                         ]  
                """;

        String path = "/books";

        // When & Then
        mvc.perform(MockMvcRequestBuilders.get(path))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJson));


    }

    @Test
    void getBookByISBN() throws Exception {
        //Given

        String expectedJson = """
            
                """;

        String path = "/books/isbn";

        // When & Then
        mvc.perform(MockMvcRequestBuilders.get(path))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJson));


    }
}
package de.neuefische.excercisebooklibary.model;

import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {

    private String isbn;
    private String title;
    private String author;
    private Kind kind;


}

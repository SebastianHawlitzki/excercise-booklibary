package de.neuefische.excercisebooklibary.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public enum Kind {
    SOFTCOVER,
    EBOOK,
    HARDCOVER
}

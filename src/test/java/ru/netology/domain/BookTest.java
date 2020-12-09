package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private final Book book = new Book(2, "Sapiens", 680, "Харари Юваль Ной");

    @Test
    public void shouldCheckAndMatchByAuthor() {
        String text = "харари Юваль ной";

        assertTrue(book.matches(text));
    }

    @Test
    public void shouldCheckAndNotMatchByAuthor() {
        String text = "дэн Браун";

        assertFalse(book.matches(text));
    }
}
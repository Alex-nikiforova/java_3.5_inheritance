package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product product = new Product(2, "Sapiens", 680);

    @Test
    public void shouldCheckAndMatchByAuthor() {
        String text = "sapiens";

        assertTrue(product.matches(text));
    }

    @Test
    public void shouldCheckAndNotMatchByAuthor() {
        String text = "Исчезнувшая";

        assertFalse(product.matches(text));
    }
}
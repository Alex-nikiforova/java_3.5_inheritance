package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    private Smartphone smartphone = new Smartphone(4, "MI 10T Pro", 45_990, "Xiaomi");

    @Test
    public void shouldCheckAndMatchByProducer() {
        String text = "xiAomi";

        assertTrue(smartphone.matches(text));
    }

    @Test
    public void shouldCheckAndNotMatchByProducer() {
        String text = "aPPle";

        assertFalse(smartphone.matches(text));
    }
}
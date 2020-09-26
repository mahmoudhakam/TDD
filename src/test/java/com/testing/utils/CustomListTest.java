package com.testing.utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomListTest {

    private List<String> underTest;

    @Test
    void itShouldBeEmpty() {
        underTest = new CustomList<>();
        assertTrue(underTest.isEmpty());
    }

    @Test
    void itShouldNotBeEmpty() {
        underTest = new CustomList<>();
        underTest.add(null);
        assertFalse(underTest.isEmpty());
    }

    @Test
    void itShouldAddOneElement() {
        underTest = new CustomList<>();
        underTest.add("kesho");
        String kesho = underTest.get(0);
        assertEquals(kesho, "kesho");
    }
}
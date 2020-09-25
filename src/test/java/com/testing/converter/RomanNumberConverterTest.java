package com.testing.converter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberConverterTest {

    private RomanNumberConverter underTest;

    @BeforeEach
    void init() {
        underTest = new RomanNumberConverter();
    }

    @ParameterizedTest
    @CsvSource({"i,1", "ii,2", "iii,3"})
    @DisplayName("Converting roman to numbers")
    public void isShouldConvertRomanToInteger(String roman, Integer expected) {
        Integer converted = underTest.convertRoman(roman);
        assertEquals(expected, converted);
    }
}

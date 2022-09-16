package com.dmitrii.elagin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RegExTest {

    @Test
    void isDigit() {
        assertTrue(RegEx.isDigit("7"));
        assertFalse(RegEx.isDigit("a"));
    }

    @Test
    void validatePin() {
        assertTrue(RegEx.validatePin("1234"));
        assertTrue(RegEx.validatePin("123456"));
        assertFalse(RegEx.validatePin("123"));
        assertFalse(RegEx.validatePin("qwerty"));
        assertFalse(RegEx.validatePin("1234567"));
    }
}
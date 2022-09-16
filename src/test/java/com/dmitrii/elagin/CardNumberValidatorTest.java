package com.dmitrii.elagin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CardNumberValidatorTest {

    @Test
    void validate() {
        assertTrue(CardNumberValidator.validate("2202201919306122"));
        assertTrue(CardNumberValidator.validate("7867567823645978"));
        assertFalse(CardNumberValidator.validate("123"));
        assertFalse(CardNumberValidator.validate("2203201919406122"));
    }
}
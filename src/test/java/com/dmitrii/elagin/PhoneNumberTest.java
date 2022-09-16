package com.dmitrii.elagin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {
    final String number = "(903) 159-2329";

    @Test
    void createPhoneNumber() {
        final int[] nums = {9, 0, 3, 1, 5, 9, 2, 3, 2, 9};

        assertEquals(number, PhoneNumber.createNumber(nums));
    }

    @Test
    void validPhoneNumber() {
        assertTrue(PhoneNumber.validateNumber(number));
        assertFalse(PhoneNumber.validateNumber(""));
        assertFalse(PhoneNumber.validateNumber("1234567890"));
        assertFalse(PhoneNumber.validateNumber("(123)456789"));
    }
}
package com.dmitrii.elagin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {

    @Test
    void reverseString() {
       final String result = Solutions.reverseString("Кошка");

       System.out.println(result);

       assertEquals("Акшок", result);
    }

    @Test
    void filterWords() {
        assertTrue(Solutions.filterWords("b..a..c"));
        assertFalse(Solutions.filterWords("qwe"));
        assertFalse(Solutions.filterWords("..z..x"));
        assertFalse(Solutions.filterWords("..b..y..c..x"));
    }
}
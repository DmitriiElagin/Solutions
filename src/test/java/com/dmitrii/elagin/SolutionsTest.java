package com.dmitrii.elagin;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{1, 3}, Solutions.twoSum(new int[]{1, 7, 5, 3, 0}, 10));
        assertArrayEquals(new int[]{2, 4}, Solutions.twoSum(new int[]{1, 7, 5, 3, 0}, 5));
        assertNull(Solutions.twoSum(new int[]{1, 7, 5, 3, 0}, 0));
    }

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

    @Test
    void isAnagram() {
        assertTrue(Solutions.isAnagram("кот", "ток"));
        assertTrue(Solutions.isAnagram("тест", "тест"));
        assertTrue(Solutions.isAnagram("тест", "ттсе"));
        assertFalse(Solutions.isAnagram("тест", "тес"));
        assertFalse(Solutions.isAnagram("тест", "тесстт"));
    }

    @Test
    void getColorByMinutes() {
        assertEquals("yellow", Solutions.getColorByMinutes(3.7));
        assertEquals("green", Solutions.getColorByMinutes(6.5));
        assertEquals("red", Solutions.getColorByMinutes(9.5));
    }

    @Test
    void multiTable() {
        assertTrue(Solutions.multiTable(5).contains("5 * 5 = 25\n"));
        assertTrue(Solutions.multiTable(5).endsWith("10 * 5 = 50"));
    }

    @Test
    void hasDuplicates() {
        assertTrue(Solutions.hasDuplicates(new Integer[]{1, 3, 2, 5, 2}));
        assertFalse(Solutions.hasDuplicates(new Integer[]{1, 2, 3, 4, 5}));
    }

    @Test
    void deleteFirstCharAndReverseOrderedList() {
        final List<String> list = Arrays.asList("One", "Two", "Three");

        Solutions.deleteFirstCharAndReverseOrderedList(list);

        assertEquals(Arrays.asList("hree", "wo", "ne"), list);
    }

    @Test
    void reverseArray() {
        final Integer[] array = {1, 2, 3, 4, 5};

        Solutions.reverseArray(array);

        assertArrayEquals(new Integer[]{5, 4, 3, 2, 1}, array);
    }

    @Test
    void reverseInt() {
        assertEquals(321, Solutions.reverseInt(123));
        assertEquals(-321, Solutions.reverseInt(-123));
    }

    @Test
    void rowSumOddNumbers() {
        assertEquals(8, Solutions.rowSumOddNumbers(2));
    }

    @Test
    void factorial() {
        assertEquals(5040, Solutions.factorial(7));
        assertEquals(1, Solutions.factorial(0));
        assertEquals(1, Solutions.factorial(1));
    }

    @Test
    void deleteNth() {
        final int[] ints = {2, 6, 4, 6, 2, 3, 8, 6, 3, 4};

        assertArrayEquals(new int[]{2, 6, 4, 3, 8}, Solutions.deleteNth(ints, 1));
        assertArrayEquals(new int[]{2, 6, 4, 6, 2, 3, 8, 3, 4}, Solutions.deleteNth(ints, 2));
        assertArrayEquals(new int[]{}, Solutions.deleteNth(ints, 0));
    }

    @Test
    void stripComments() {
        final String text = "text &comment \ntext \ntext ! comment ";

        assertEquals("text\ntext\ntext", Solutions.stripComments(text, new String[]{"&", "!"}));

    }

    @Test
    void moveZerosToEnd() {
        final int[] ints = {0, 1, 0, 3, 5, 0, 9};

        Solutions.moveZerosToEnd(ints);

        assertArrayEquals(new int[]{1, 3, 5, 9, 0, 0, 0}, ints);
    }

    @Test
    void getMiddle() {
        assertEquals("es", Solutions.getMiddle("test"));
        assertEquals("s", Solutions.getMiddle("test2"));
    }
}
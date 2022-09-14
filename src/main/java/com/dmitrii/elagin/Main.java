package com.dmitrii.elagin;

import java.util.*;

import static com.dmitrii.elagin.Solutions.*;

public class Main {

    public static void main(String[] args) {

        //boolean valid=CardNumberValidator.validate("2202201919306122");
        //System.out.println(valid);
        //System.out.println(PhoneNumber.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
        //System.out.println(PhoneNumber.validPhoneNumber("(123) 456-7890"));
//        int[] ints = Solutions.twoSum(new int[]{3, 5, 7,-3,18,123}, 10);
//
//        System.out.println(ints[0]+", " +ints[1]);
//        String text="a &b \nc \nd ! e ";
//
//        System.out.println(Solutions.stripComments(text,new String[]{"!","&"}));
//        System.out.println(isAnagram("Мама", "амма"));
//        System.out.println(isAnagram("Каролина", "АниЛорак"));
//        System.out.println(isAnagram("Рим", "Мир"));
        //System.out.println(getMiddle("Hello"));
        //System.out.println(getMiddle("Mama"));
        //System.out.println(getColorByMinutes(77));
//        System.out.println(hasDuplicates(new Integer[]{2,5,7,3,4,2}));
//        System.out.println(reverse(500000055));
//        System.out.println(multiTable(5));
//        System.out.println(MorseCodeDecoder.decode("..-. ..- -.-. -.-   -- ."));
//        System.out.println(rowSumOddNumbers(2));
//        int[] elements = {2, 3, 4, 6, 2, 3, 8, 5, 3, 4, 4};
////        System.out.println(Arrays.toString(deleteNth(elements, 1)));
        Integer[] ints = {0,1,0,3,1,2, 25,14,0,9,34};
//        moveZerosToEnd(ints);
//        System.out.println(Arrays.toString(ints));

        List<String> names =  new ArrayList<>();
        names.add("Anna");
        names.add("Dmitrii");
        names.add("John");
        names.add("Maria");

        deleteFirstCharAndReverseOrderedList(names);
        System.out.println(names);
        reverseArray(ints);
        System.out.println(Arrays.toString(ints));
    }

}

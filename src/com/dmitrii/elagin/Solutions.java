package com.dmitrii.elagin;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solutions {

    //Находит индексы 2-х элементов массива, суммой которых является target
    public static int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    //Удаляет весь текст, закомментированный  указанными в аргументе символами
    public static String stripComments(String text, String[] commentSymbols) {
        String symbols = String.format("[ ]*([%s].*)?$", String.join("", commentSymbols));
        return Stream.of(text.split("\n")).map(t -> t.replaceAll(symbols, ""))
                .collect(Collectors.joining("\n"));
    }

    //Проверяет, являются ли строки анограммой
    public static boolean isAnagram(String s1, String s2) {

        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);

    }

    //Возращает средние символы в слове(1 или 2 в зависимости от четности)
    public static String getMiddle(String word) {

        //  String result="";

//     int length=word.length();

//     if(length%2>0) {
//     result+word.charAt()
//     }
        return (word.length() % 2 > 0) ? "" + word.charAt(word.length() / 2) : ""
                + word.charAt(word.length() / 2 - 1) + "" + word.charAt(word.length() / 2);
    }

}


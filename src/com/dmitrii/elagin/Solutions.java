package com.dmitrii.elagin;

import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solutions {

    //Находит индексы 2-х элементов массива, суммой которых является target
    public static int[] twoSum(int [] numbers, int target) {

    for(int i=0; i<numbers.length; i++) {
        for(int j=i+1; j<numbers.length; j++) {
            if(numbers[i]+numbers[j]==target) {
                return  new int[]{i,j};
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

}


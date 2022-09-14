package com.dmitrii.elagin;

import java.util.*;
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

    public static int reverse(int x) {
        StringBuilder builder = new StringBuilder("" + x);
        builder.reverse();

        if (builder.charAt(builder.length() - 1) == '-') {
            builder.deleteCharAt(builder.length() - 1);
            builder.insert(0, '-');
        }

        try {
            return Integer.parseInt(builder.toString());
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            sb.append(String.format("%d * %d = %d", i, num, i * num));

        }
        return sb.toString().trim();
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

    // Получить цвет свотофора по времени
    public static String getColorByMinutes(double min) {
        String result = "";
        double tmp = min % 5.0f;
        System.out.println(tmp);
        if ((tmp >= 0) && (tmp < 3.0f)) {
            result = "зеленый";
        }
        if ((tmp >= 3.0f) && (tmp < 4.0f)) {
            result = "желтый";
        }

        if ((tmp >= 4.0f) && (tmp < 5.0f)) {
            result = "красный";
        }
        return result;
    }

    public static <T> boolean hasDuplicates(T[] array) {

        Set<T> set = new HashSet<>();

        for (T item : array) {
            if (!set.add(item)) {
                return true;
            }
        }
        return false;
    }

    public static int rowSumOddNumbers(int n) {
//        int res = 0;
//        for(int c = 1, i = 1; c <=n; c++) {
//           res = 0;
//            for(int r = 1; r <= c; r++, i+=2) {
//                res += i;
//            }
//        }
//        
//        return res;

        return n * n * n;
    }

    public static int factorial(int n) {
        int res = 1;
//            if(n < 0 || n > 12) {
//                throw new IllegalArgumentException("The argument must be greater than 0 and less than 12");
//            }

        if (n == 0 || n == 1) {
            return res;
        }

//         for(int i = n; i > 1; i--) {
//             res *= i;
//             
//         }
        res = n * factorial(n - 1);
        return res;
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> occurMap = new HashMap<>();
        
//        LinkedList<Integer> list = new LinkedList<>();
        
       return Arrays.stream(elements).filter(i -> {
            
           occurMap.merge(i, 1, Integer::sum);
             
             return occurMap.get(i) <= maxOccurrences;

        }).toArray();
//
//        if (maxOccurrences > 0) {
//            for (int i : elements) {
//
//                if (occurMap.containsKey(i)) {
//                    int occurNum = occurMap.get(i);
//                    if (occurNum < maxOccurrences) {
//                        occurMap.put(i, ++occurNum);
//                        list.add(i);
//                    }
//
//                } else {
//                    occurMap.put(i, 1);
//                    list.add(i);
//                }
//
//            }
//        }
//
//        int res[] = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            res[i] = list.get(i);
//        }
//
//        return res;

    }

    public static void moveZerosToEnd(int[] data) {
        for(int i = 0, n = data.length; i < n -1; i++) {
            if(data[i] == 0) {
                n--;
                System.arraycopy(data, i + 1, data, i, n - i);
                data[n] = 0;
            }
        }
    }

    public static void deleteFirstCharAndReverseOrderedList(List<String> names) {
        names.replaceAll(s -> s.substring(1));
        names.sort(Comparator.reverseOrder());
    }

    public static <T> void reverseArray(T[] data) {
        for(int i = 0, n = data.length -1; i <= n; i++, n--) {
            T temp = data[i];
            data[i] = data[n];
            data[n] = temp;
        }
    }
    


}

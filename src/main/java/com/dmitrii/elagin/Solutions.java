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

    //Проверяет наличие в строке хороших и отсутствие плохих слов
    public static boolean filterWords(String text) {
        final String[] badWords = {"x", "y", "z"};
        final String[] goodWords = {"a", "b", "c"};

        return Arrays.stream(goodWords)
                .anyMatch(text :: contains)
               && Arrays.stream(badWords)
                       .noneMatch(text :: contains);
    }

    //Переворачивает строку и делает первый символ заглавным
    public static String reverseString(String s) {
        String reverseString = new StringBuilder(s).reverse().toString();

        reverseString = reverseString.substring(0, 1).toUpperCase()
                + reverseString.substring(1).toLowerCase();

        return  reverseString;
    }

    //Переворачивает цифры в целом числе в обратном порядке
    public static int reverseInt(int x) {
        final StringBuilder builder = new StringBuilder("" + x);
        builder.reverse();

        if (builder.charAt(builder.length() - 1) == '-') {
            builder.deleteCharAt(builder.length() - 1);
            builder.insert(0, '-');
        }

        return Integer.parseInt(builder.toString());
    }

    public static String multiTable(int num) {
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            builder
                    .append(i)
                    .append(" * ")
                    .append(num)
                    .append(" = ")
                    .append(i * num);

            if (i < 10) {
                builder.append('\n');
            }

        }
        return builder.toString();
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

    /**
     * Возвращает строку с текущим цветом световора исходя из указанного колличества пройденных минут
     * При условии, что первым 3 минуты горит зеленый, далее 1 минуту горит желтый, и 1 минуту горит красный
     *
     * @param min - колличество минут, прошедших с начала работы светофора
     * @return Строковое представление цвета светофора
     */
    public static String getColorByMinutes(double min) {
        String result = "";

        double tmp = min % 5.0f;

        if ((tmp >= 0) && (tmp < 3.0f)) {
            result = "green";
        }

        if ((tmp >= 3.0f) && (tmp < 4.0f)) {
            result = "yellow";
        }

        if ((tmp >= 4.0f) && (tmp < 5.0f)) {
            result = "red";
        }

        return result;
    }

    public static <T> boolean hasDuplicates(T[] array) {
        final Set<T> set = new HashSet<>();

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

    /**
     * Удаляет лишние дубликаты чисел из массива, колличество которых превышает указанное число вхождений
     *
     * @param ints           Массив целых цисел
     * @param maxOccurrences Допустимое колличество вхождений каждого числа
     * @return массив целых чисел, отфильтрованный от лишних дубликатов
     */
    public static int[] deleteNth(int[] ints, int maxOccurrences) {
        final HashMap<Integer, Integer> occurMap = new HashMap<>();

        return Arrays.stream(ints).filter(i -> {
            occurMap.merge(i, 1, Integer::sum);

            return occurMap.get(i) <= maxOccurrences;

        }).toArray();

    }

    public static void moveZerosToEnd(int[] data) {
        for (int i = 0, n = data.length; i < n - 1; i++) {
            if (data[i] == 0) {
                n--;
                System.arraycopy(data, i + 1, data, i, n - i);
                data[n] = 0;
            }
        }
    }

    public static void deleteFirstCharAndReverseOrderedList(List<String> list) {
        for (int i = 0, n = list.size() - 1; i <= n; i++, n--) {
            final String tmp = list.get(i);
            list.set(i, list.get(n));
            list.set(n, tmp);
        }

        list.replaceAll(l -> l.substring(1));
    }

    public static <T> void reverseArray(T[] data) {
        for (int i = 0, n = data.length - 1; i <= n; i++, n--) {
            T temp = data[i];
            data[i] = data[n];
            data[n] = temp;
        }
    }
}

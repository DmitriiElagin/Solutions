package com.dmitrii.elagin;

import java.util.regex.Pattern;

public class PhoneNumber {

    public static String createPhoneNumber(int[] nums) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", nums[0],nums[1],nums[2],nums[3],nums[4],
                nums[5],nums[6],nums[7],nums[8],nums[9]);
    }

public  static boolean validPhoneNumber(String s) {
//Проверяет соответствует строки шаблону регулярного выражения
    //\d{3} - числовые символы с указанием их колличества в фигурных скобках, \s - пробельный символ
   return Pattern.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}",s);

}

}

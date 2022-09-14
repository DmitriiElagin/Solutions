package com.dmitrii.elagin;

public class CardNumberValidator {


    //Реализация алгоритма Луна для проверки номеров кредитных карт
    public static boolean validate(String n) {

        if (n.length() > 16) return false;
        int nums[] = new int[n.length()];


        for (int i = 0; i < n.length(); i++) {
            nums[i] = n.charAt(i)-'0';
        }
        int a = nums.length % 2 > 0 ? 1 : 0;

        for (int i = a; i < nums.length; i += 2) {
            nums[i] *= 2;
            if (nums[i] >9) nums[i] -= 9;
        }

        int sum = 0;

        for (int i : nums) {
            sum += i;
        }

        return sum % 10 == 0;
    }


}

package com.dmitrii.elagin;

public class Main {

    public static void main(String[] args) {

        boolean valid=CardNumberValidator.validate("2202201919306122");

        System.out.println(valid);
        System.out.println(PhoneNumber.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
        System.out.println(PhoneNumber.validPhoneNumber("(123) 456-7890"));

        int[] ints = Utils.twoSum(new int[]{3, 5, 7,-3,18,123}, 130);

        System.out.println(ints[0]+", " +ints[1]);
    }
}

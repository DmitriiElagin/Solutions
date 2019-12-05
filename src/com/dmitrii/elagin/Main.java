package com.dmitrii.elagin;

public class Main {

    public static void main(String[] args) {

        boolean valid=CardNumberValidator.validate("2202201919306122");

        System.out.println(valid);
        System.out.println(PhoneNumber.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
    }
}

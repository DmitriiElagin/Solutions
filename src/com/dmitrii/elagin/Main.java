package com.dmitrii.elagin;

public class Main {

    public static void main(String[] args) {

        boolean valid=CardNumberValidator.validate("2202201919306122");

        System.out.println(valid);
    }
}

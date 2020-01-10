package com.dmitrii.elagin;

//Здесь решения задач с помощью регулярных выражений
public class RegEx {

    //Проверяет, является ли символ в строке числом
    public static boolean isDigit(String s) {
        return    s.matches("\\d");
    }

    //Проверяет, является ли строка пином из 4 или 6 цифр
    public static boolean validatePin(String s) {
        return s.matches("(\\d{4})|(\\d{6})");
    }
}

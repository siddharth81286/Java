package com.sayem.exercises.codingbat.string1;

public class ComboString {

    public static void main(String[] args) {

        System.out.println(comboString("Hello", "hi"));
        System.out.println(comboString("hi", "Hello"));
        System.out.println(comboString("aaa", "b"));
    }

    private static String comboString(String a, String b) {

        if (a.length() > b.length()){
            return b + a + b;
        }else{
            return a + b + a;
        }

    }
}

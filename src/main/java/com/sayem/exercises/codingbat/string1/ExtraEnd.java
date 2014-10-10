package com.sayem.exercises.codingbat.string1;

public class ExtraEnd {

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));


    }

    private static String extraEnd(String str) {

        String a = str.substring(str.length() - 2);
        return a + a + a;

    }
}

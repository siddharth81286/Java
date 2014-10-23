package com.sayem.exercises.codingbat.warmup1;

public class FrontBack {

    public static void main(String[] args) {

        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    public static String frontBack(String str) {

        String last = str.substring(str.length() - 1);
        String first = str.substring(0);

        return null;
    }
}

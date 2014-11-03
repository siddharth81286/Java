package com.sayem.exercises.codingbat.string1;

public class MiddleTwo {

    public static void main(String[] args) {

        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
    }

    public static String middleTwo(String str) {

        int half = str.length() / 2;
        return str.substring(half - 1, half+1);
    }
}

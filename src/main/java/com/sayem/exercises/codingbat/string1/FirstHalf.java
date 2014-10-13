package com.sayem.exercises.codingbat.string1;

public class FirstHalf {

    public static void main(String[] args) {

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }

    public static String firstHalf(String str) {
        int len = str.length();
        return str.substring(0, len/2);
    }
}

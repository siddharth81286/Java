package com.sayem.exercises.codingbat.warmup1;

public class StartHi {

    public static void main(String[] args) {

        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));

    }

    private static boolean startHi(String str) {

        return str.startsWith("hi");
    }
}

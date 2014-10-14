package com.sayem.exercises.codingbat.string1;

public class NonStart {

    public static void main(String[] args) {

        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));
    }

    private static String nonStart(String a, String b) {

        String x = a.substring(1);
        String y = b.substring(1);

        return x + y;
    }
}

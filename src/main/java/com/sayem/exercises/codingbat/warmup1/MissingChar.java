package com.sayem.exercises.codingbat.warmup1;


public class MissingChar {
    public static void main(String[] args){

        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
    }

    private static String missingChar(String str, int n){

        String first = str.substring(0, n);
        String last = str.substring(n+1);

        return first + last;

    }
}

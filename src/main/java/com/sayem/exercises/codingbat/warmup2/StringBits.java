package com.sayem.exercises.codingbat.warmup2;

public class StringBits {

    public static void main(String[] args) {

        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }

    private static String stringBits(String str) {
        String result = "";

        for (int i=0; i<str.length(); i+=2) {
            result = result + str.substring(i, i + 1);
        }

        return result;
    }

}

package com.sayem.exercises.codingbat.string2;


public class DoubleChar {

    public static void main(String[] args){

        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
    }

    private static String doubleChar(String str) {

        String x = "";

        for (int i=0; i<str.length(); i++){
            x += str.charAt(i);
            x += str.charAt(i);


        }

        return x ;
    }
}

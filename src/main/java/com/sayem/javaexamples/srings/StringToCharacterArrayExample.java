package com.sayem.javaexamples.srings;

public class StringToCharacterArrayExample {
    public static void main(String[] args) {

        String strOrig = "Hello World";

        char[] stringArray;

        stringArray = strOrig.toCharArray();

        for (char aStringArray : stringArray) {
            System.out.print(aStringArray);
        }
    }
}

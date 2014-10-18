package com.sayem.exercises.codingbat.string1;

public class WithoutEnd2 {

    public static void main(String[] args) {

        System.out.println(withouEnd2("Hello"));
        System.out.println(withouEnd2("abc"));
        System.out.println(withouEnd2("ab"));
    }

    public static String withouEnd2(String str) {

        String s = str.split(0, 1);

        return s;
    }
}

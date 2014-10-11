package com.sayem.exercises.codingbat.string1;

public class FirstTwo {

    public static void main(String[] args) {

        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("b"));
    }

    public static String firstTwo(String str) {

        if (str.length() >= 2){
            return str.substring(0, 2);
        }else{
            return str;
        }
    }

}

package com.sayem.exercises.codingbat.warmup1;

public class CountXX {

    public static void main(String[] args) {

        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }

    private static int countXX(String str) {
<<<<<<< HEAD
        char[] s = str.toCharArray();

        return 0;
=======

        int count = 0;
        for (int i = 0; i < str.length() -1; i++){

            if (str.substring(i, i+2).equalsIgnoreCase("xx")){
                count++;
            }
        }
        return count;
>>>>>>> aac903d884c887ba591dd0eee49c7dcef39bfd8c
    }
}

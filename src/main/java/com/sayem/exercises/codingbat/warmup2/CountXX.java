package com.sayem.exercises.codingbat.warmup2;

public class CountXX {

    public static void main(String[] args) {

        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }

    private static int countXX(String str) {

        int count = 0;
        for (int i = 0; i < str.length() -1; i++){

            if (str.substring(i, i+2).equalsIgnoreCase("xx")){
                count++;
            }
        }
        return count;
    }
}

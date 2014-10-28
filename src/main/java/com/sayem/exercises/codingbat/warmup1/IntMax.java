package com.sayem.exercises.codingbat.warmup1;

public class IntMax {

    public static void main(String[] args) {

        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));
    }

    private static int intMax(int a, int b, int c) {

        if (a > b && a > c){
            return a;
        }else if (b > a && b > c){
            return b;
        }else{
            return c;
        }

    }
}

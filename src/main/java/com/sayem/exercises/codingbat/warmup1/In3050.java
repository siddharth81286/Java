package com.sayem.exercises.codingbat.warmup1;

public class In3050 {

    public static void main(String[] args) {

        System.out.println(in3050(30, 31));
        System.out.println(in3050(30, 41));
        System.out.println(in3050(40, 50));
    }

    public static boolean in3050(int a, int b) {

        if (a >= 30 && b <= 4 || a >= 40 && b <= 50) {
            return true;
        }else{
            return false;
        }
    }
}

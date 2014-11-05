package com.sayem.exercises.codingbat.logic1;

public class SortaSum {
    public static void main(String[] args) {

        System.out.println(sortaSum(3, 4) );
        System.out.println(sortaSum(9, 4));
        System.out.println(sortaSum(10, 11));
    }

    private static int sortaSum(int a, int b) {

        if (a + b >= 10 && a + b <= 20){
            return 20;
        }else {
            return a + b;
        }
    }
}

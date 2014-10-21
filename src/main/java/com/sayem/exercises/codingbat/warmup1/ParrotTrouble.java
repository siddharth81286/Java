package com.sayem.exercises.codingbat.warmup1;

public class ParrotTrouble {

    public static void main(String[] args) {

        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
    }

    public static boolean parrotTrouble(boolean talking, int hour) {

        return (hour < 7 && talking) || hour > 20 && talking;
    }
}

package com.sayem.exercises.codingbat.logic1;

public class SquirrelPlay {

    public static void main(String[] args) {

        System.out.println(squirrelPlay(70, false));
        System.out.println(squirrelPlay(95, false));
        System.out.println(squirrelPlay(95, true) );
    }

    private static boolean squirrelPlay(int temp, boolean isSummer) {

        if (isSummer){
            return temp >= 60 && temp <= 100;
        }else if (temp >= 60 && temp <= 90){
            return true;
        }else{
            return false;
        }

    }
}

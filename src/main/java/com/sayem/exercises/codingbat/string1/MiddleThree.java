package com.sayem.exercises.codingbat.string1;

public class MiddleThree {

    public static void main(String[] args) {

        System.out.println(middleThree("Candy")); //   → "and"
        System.out.println(middleThree("and")); //     → "and"
        System.out.println(middleThree("solving")); // → "lvi"
    }

    /*
    Given a string of odd length, return the string length 3 from its middle,
    so "Candy" yields "and". The string length will be at least 3.
     */
    private static String middleThree(String str) {

        int x = str.length() / 2;

        if (str.length() >= 3){
            return str.substring(x - 1, x + 2 );
        }else{
            return null;
        }
    }
}

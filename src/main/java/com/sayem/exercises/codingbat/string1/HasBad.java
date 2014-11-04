package com.sayem.exercises.codingbat.string1;

public class HasBad {

    public static void main(String[] args) {

        System.out.println(hasBad("badxx")); // true
        System.out.println(hasBad("xbadxx")); // true
        System.out.println(hasBad("xxbadxx")); // false
        System.out.println(hasBad("bad")); // true
        System.out.println(hasBad("xba")); // true
    }

    /*
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length,
    including 0. Note: use .equals() to compare 2 strings.
     */
    private static boolean hasBad(String str) {

        if (str.length() >= 3)
            return str.substring(0, 3).equals("bad");

        if (str.length() > 4){
            return str.substring(1, 3).equals("bad");
        }else{
            return false;
        }
    }
}

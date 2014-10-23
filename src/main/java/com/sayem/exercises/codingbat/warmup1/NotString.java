package com.sayem.exercises.codingbat.warmup1;

public class NotString {

    /*
    Given a string, return a new string where "not " has been added to the front. However,
     if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
     */

    public static void main(String[] args) {

        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
    }

    public static String notString(String str) {

        if (!str.startsWith("not")){
            return "not " + str;
        }else{
            return str;
        }
    }
}

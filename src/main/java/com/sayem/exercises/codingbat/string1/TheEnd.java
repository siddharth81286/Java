package com.sayem.exercises.codingbat.string1;

public class TheEnd {
    public static void main(String[] args) {

        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));
    }

    public static String theEnd(String str, boolean front) {

        if (!front){
            return str.substring(str.length() - 1);
        }else{
            return str.substring(0, 1);
        }
    }
}

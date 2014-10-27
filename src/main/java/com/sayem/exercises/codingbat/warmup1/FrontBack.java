package com.sayem.exercises.codingbat.warmup1;

public class FrontBack {

    public static void main(String[] args) {

        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    public static String frontBack(String str) {

        if (str.length() <= 1)
            return str;

        String mid = str.substring(1, str.length() - 1);

        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

}

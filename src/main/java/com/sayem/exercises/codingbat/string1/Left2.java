package com.sayem.exercises.codingbat.string1;

public class Left2 {

    public static void main(String[] args) {

        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));
    }

    public static String left2(String str) {


        String x = str.substring(0, 2);
        String y = str.substring(2);

        if (str.length() > 2){
            return y + x ;
        }else{
            return str;
        }
    }
}

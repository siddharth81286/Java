package com.sayem.exercises.codingbat.warmup1;

public class Front22 {

    public static void main(String[] args) {

        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
    }

    public static String front22(String str) {
        String last;

        if (str.length() <= 2){
            return str + str + str;
        }else{
            last = str.substring(0, 2);
            return last + str + last;
        }
    }

}

package com.sayem.exercises.codingbat.warmup1;

public class Front3 {

    public static void main(String[] args) {

        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
        System.out.println(front3(""));
        System.out.println(front3("a"));

    }

    public static String front3(String str) {


        String front;

        if (str.length() >= 3){
            front = str.substring(0, 3);
        }else{
            front = str;
        }

        return front + front + front;
    }
}

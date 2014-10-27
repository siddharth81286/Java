package com.sayem.exercises.codingbat.warmup1;

public class DelDel {

    public static void main(String[] args) {

        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
        System.out.println(delDel(""));
    }

    private static String delDel(String str) {

        if (str.length() > 0 && str.substring(1).startsWith("del")){
            return str.substring(0, 1) + str.substring(4);
        }else{
            return str;
        }

    }
}

package com.sayem.exercises.codingbat.warmup1;

public class StartOz {

    public static void main(String[] args) {

        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
        System.out.println(startOz(""));
        System.out.println(startOz("a"));
    }

    private static String startOz(String str) {

        if (str.length() >= 1 && str.substring(0).startsWith("oz")){
            return "oz";
        }else if (str.length() >= 0 && str.substring(0).startsWith("o")){
            return "o";
        }else if (str.length() >= 1 && str.substring(1).startsWith("z"))
            return "z";

        return "";
    }
}

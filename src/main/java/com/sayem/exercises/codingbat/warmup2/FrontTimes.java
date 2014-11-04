package com.sayem.exercises.codingbat.warmup2;

public class FrontTimes {

    public static void main(String[] args) {

        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
        System.out.println(frontTimes("A", 4));
    }

    private static String frontTimes(String str, int n) {

        String result = "";

        for (int i = 0; i < n; i++){

            if (str.length() >= 3){
                result = result + str.substring(0, 3);
            }else{
                result = result + str;
            }
        }

        return result;
    }
}

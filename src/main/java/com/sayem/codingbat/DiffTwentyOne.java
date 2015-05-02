package com.sayem.codingbat;

/**
 * Created by sayem on 5/2/15.
 */
public class DiffTwentyOne {

    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
    }

    private static int diff21(int n) {

        if (n > 21){
            return (21 - n) * 2;
        }else{
            return 21 - n;
        }

    }
}

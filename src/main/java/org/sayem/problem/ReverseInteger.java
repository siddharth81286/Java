package org.sayem.problem;

/**
 * Created by syed.sayem on 6/20/15.
 */
public class ReverseInteger {


    public static void main(String[] args) {

        System.out.println(reverse(1234));

    }

    public static int reverse(int x){
        int rev = 0;
        while (x != 0){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return rev;
    }
}

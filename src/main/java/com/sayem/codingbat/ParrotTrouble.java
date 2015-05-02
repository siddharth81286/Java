package com.sayem.codingbat;

/**
 * Created by sayem on 5/2/15.
 */
public class ParrotTrouble {

    public static void main(String[] args) {

        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
    }

    private static boolean parrotTrouble(boolean talking, int hour) {

        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }else {
            return false;
        }
    }

}

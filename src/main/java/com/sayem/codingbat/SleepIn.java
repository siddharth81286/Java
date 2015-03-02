package com.sayem.codingbat;

public class SleepIn {

    public static void main(String[] args) {

        sleepIn(false, false);
        sleepIn(true, false);
        sleepIn(false, true);
    }

    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}

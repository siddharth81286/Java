package org.sayem.java8.time.api;

import org.testng.annotations.Test;

import java.time.LocalDate;

/**
 * Created by syed.sayem on 6/13/15.
 */
public class LocalDateExample {

    @Test
    public void localDate(){

        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        System.out.println("Today's Local date : " + today);
        System.out.printf("Year : %d Month : %d day : %d \t", year, month, day);
    }
}

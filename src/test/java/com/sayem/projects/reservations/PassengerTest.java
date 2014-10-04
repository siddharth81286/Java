package com.sayem.projects.reservations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PassengerTest {

    @Test
    public void testPassenger(){
        Passenger testPassenger1 = new Passenger();
        String result = testPassenger1.getName();
        assertEquals("Unknown name", result);
    }

    @Test
    public void testSetName(){
        Passenger testPassenger2 = new Passenger();
        testPassenger2.setName("Syed Sayem");
        assertEquals("Syed Sayem", testPassenger2.getName());
    }
}

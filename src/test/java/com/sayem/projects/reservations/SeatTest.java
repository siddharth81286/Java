package com.sayem.projects.reservations;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SeatTest {

    @Test
    public void testSeat(){
        Seat testSeat1 = new Seat();
        assertEquals(10, testSeat1.getSeatNumber());
    }

    @Test
    public void testSetSeat(){
        Seat testSeat2 = new Seat();
        testSeat2.setSeatNumber(5);
        assertEquals(5, testSeat2.getSeatNumber());
    }
}

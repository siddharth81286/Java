package com.sayem.projects.reservations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    @Test
    public void testDatabase(){
        Database testDB = new Database();
        assertEquals(0, testDB.getSeats().size());
        assertEquals(0, testDB.getFlights().size());
        assertEquals(0, testDB.getPassengers().size());
        assertEquals(0, testDB.getTickets().size());
    }
}

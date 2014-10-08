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

    @Test
    public void testAddSeat(){
        Database testDB = new Database();
        testDB.addSeat(2);
        assertEquals(1, testDB.getSeats().size());
    }

    @Test
    public void testAddFlight(){
        Database testDB = new Database();
        testDB.addFlight(1000, "New York", "London");
        assertEquals(1, testDB.getFlights().size());
    }

    @Test
    public void testAddPassenger(){
        Database testDB = new Database();
        testDB.addPassenger("Syed Sayem");
        assertEquals(1, testDB.getPassengers().size());
    }
 }

package com.sayem.projects.reservations;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlightTest {

    @Test
    public void testFlight(){
        Flight testFlight1 = new Flight();
        assertEquals("Unknown Departure City", testFlight1.getDepartureCity());
        assertEquals("Unknown Arrival City", testFlight1.getArrivalCity());
        assertEquals(100, testFlight1.getFlightNumber());
    }

    @Test
    public void testSetDepartureCity(){
        Flight testFlight2 = new Flight();
        testFlight2.setDepartureCity("Los Angelas");
        assertEquals("Los Angelas", testFlight2.getDepartureCity());
    }

    @Test
    public void testArrivalCity(){
        Flight testFlight3 = new Flight();
        testFlight3.setArrivalCity("Chicago");
        assertEquals("Chicago", testFlight3.getArrivalCity());
    }

    @Test
    public void testSetFlightNumber(){
        Flight testFlight4 = new Flight();
        testFlight4.setFlightNumber(1000);
        assertEquals(1000, testFlight4.getFlightNumber());
    }
}

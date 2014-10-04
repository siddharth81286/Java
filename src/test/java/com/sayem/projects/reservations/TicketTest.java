package com.sayem.projects.reservations;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TicketTest {

    @Test
    public void testSetPassenger(){
        Ticket testTicket = new Ticket();
        Passenger testPassenger = new Passenger("Syed Sayem");
        testTicket.setPassenger(testPassenger);
        assertEquals("Syed Sayem", testTicket.getPassenger().getName());
    }

    @Test
    public void testSetSeat(){
        Ticket testTicket = new Ticket();
        Seat testSeat = new Seat(2);
        testTicket.setSeat(testSeat);
        assertEquals(2, testTicket.getSeat().getSeatNumber());
    }

    @Test
    public void testSetFlight(){
        Ticket testTicket = new Ticket();
        Flight flight = new Flight(3, "New York", "London");
        testTicket.setFlight(flight);
        assertEquals("London", testTicket.getFlight().getArrivalCity());
        assertEquals("New York", testTicket.getFlight().getDepartureCity());
        assertEquals(3, testTicket.getFlight().getFlightNumber());
    }
}

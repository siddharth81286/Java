package com.sayem.projects.reservations;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FlightTest.class,
        PassengerTest.class,
        SeatTest.class,
        TicketTest.class
})
public class AllTests {}

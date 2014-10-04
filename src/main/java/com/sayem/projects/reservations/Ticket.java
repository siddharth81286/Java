package com.sayem.projects.reservations;

import java.time.LocalDate;

public class Ticket {

    // Field
    private LocalDate departureDate;
    private Flight flight;
    private Passenger passenger;
    private Seat seat;

    // Constructor
    public Ticket(){
        departureDate = LocalDate.now();
    }

    public Ticket(LocalDate departureDate, Flight flight, Passenger passenger, Seat seat) {
        this.departureDate = departureDate;
        this.flight = flight;
        this.passenger = passenger;
        this.seat = seat;
    }

    // Getters and Setters
    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}

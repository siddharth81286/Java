package com.sayem.projects.reservations;

import java.util.ArrayList;

public class Database {

    private ArrayList<Seat> seats;
    private ArrayList<Passenger> passengers;
    private ArrayList<Flight> flights;
    private ArrayList<Ticket> tickets;

    public Database() {
        seats = new ArrayList<Seat>();
        flights = new ArrayList<Flight>();
        passengers = new ArrayList<Passenger>();
        tickets = new ArrayList<Ticket>();
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
}

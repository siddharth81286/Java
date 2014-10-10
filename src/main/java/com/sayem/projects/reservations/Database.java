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

    public void addSeat(int seatNumber) {
        seats.add(new Seat(seatNumber));
    }

    public void addFlight(int flightNumber, String departureCity, String arrivalCity) {
        flights.add(new Flight(flightNumber, departureCity, arrivalCity));
    }

    public void addPassenger(String name) {
        passengers.add(new Passenger(name));
    }

    public void bootstrap(){
        addSeat(1);
        addSeat(2);
        addSeat(3);
        addSeat(4);
        addSeat(5);
        addSeat(6);

        addFlight(1001, "New York", "Chicago");
        addFlight(1002, "Los Angeles", "New York");
        addFlight(1003, "Chicago", "Atlanta");
        addFlight(1004, "Atlanta", "Chicago");
        addFlight(1005, "Newark", "Miami");
    }
}

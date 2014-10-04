package com.sayem.projects.reservations;

public class Flight {

    // Fields
    private int flightNumber;
    private String departureCity;
    private String arrivalCity;

    // Constructor
    public Flight() {
        departureCity = "Unknown Departure City";
        arrivalCity = "Unknown Arrival City";
        flightNumber = 100;

    }

    // Setters / Getters
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }
}

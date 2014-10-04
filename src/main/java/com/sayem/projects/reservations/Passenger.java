package com.sayem.projects.reservations;

public class Passenger {

    private String name;  // Passenger name

    // constructor
    public Passenger() {
        this.name = "Unknown name";
    }

    public Passenger(String name) {
        this.name = name;
    }

    // getters
    public String getName() {
        return name;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passenger: " + this.getName();
    }
}

package com.sayem.projects.reservations;

public class Seat {

    private int seatNumber;

    public Seat() {
        seatNumber = 10;
    }

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}

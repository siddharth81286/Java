package com.sayem.module1.chapter12;

// Use an enum constructor, instance variable, and method.
enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed; // typical speed of each transport

    // Constructor
    Transport(int s) { speed = s; }

    int getSpeed() { return speed; }
}
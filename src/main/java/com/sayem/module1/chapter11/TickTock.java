package com.sayem.module1.chapter11;

// No calls to wait() or notify().
class TickTock {

    String state; // contains the state of the clock

    synchronized void tick(boolean running) {
        if(!running) { // stop the clock
            state = "ticked";
            return;
        }

        System.out.print("Tick ");

        state = "ticked"; // set the current state to ticked
    }

    synchronized void tock(boolean running) {
        if(!running) { // stop the clock
            state = "tocked";
            return;
        }

        System.out.println("Tock");

        state = "tocked"; // set the current state to tocked
    }
}
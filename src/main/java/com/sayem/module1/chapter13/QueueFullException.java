package com.sayem.module1.chapter13;

// An exception for queue-full errors.
class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) { size = s; }

    public String toString() {
        return "\nQueue is full. Maximum size is " +
                size;
    }
}
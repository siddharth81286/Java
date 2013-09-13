package com.sayem.chapter8;

import com.sayem.chapter9.QueueEmptyException;
import com.sayem.chapter9.QueueFullException;

public interface ICharQ {
    // Put a characer into the queue.
    void put(char ch) throws QueueFullException;

    // Get a character from the queue.
    char get() throws QueueEmptyException;
}
package com.sayem.module1.chapter9;

import com.sayem.module1.chapter8.ICharQ;

// A fixed-size queue class for characters that uses exceptions.
class FixedQueue implements ICharQ {
    private char q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty queue given its size.
    public FixedQueue(int size) {
        q = new char[size+1]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // Put a characer into the queue.
    public void put(char ch)
            throws QueueFullException {

        if(putloc==q.length-1)
            throw new QueueFullException(q.length-1);

        putloc++;
        q[putloc] = ch;
    }

    // Get a character from the queue.
    public char get()
            throws QueueEmptyException {

        if(getloc == putloc)
            throw new QueueEmptyException();

        getloc++;
        return q[getloc];
    }
}
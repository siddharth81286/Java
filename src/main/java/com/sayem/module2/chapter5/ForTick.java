package com.sayem.module2.chapter5;

// Demonstrate the for loop.
class ForTick {
    public static void main(String args[]) {
        int n;

        for(n=10; n>0; n--)
            System.out.println("tick " + n);
    }
}

// Declare a loop control variable inside the for.
class ForTick2 {
    public static void main(String args[]) {

        // here, n is declared inside of the for loop
        for(int n=10; n>0; n--)
            System.out.println("tick " + n);
    }
}
package com.sayem.module1.chapter9;

class RethrowDemo {
    public static void main(String args[]) {
        try {
            Rethrow.genException();
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            // recatch exception
            System.out.println("Fatal error -- " +
                    "program terminated.");
        }
    }
}
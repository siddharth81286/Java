package com.sayem.module1.chapter6;

class CallByValue {
    public static void main(String args[]) {
        Test1 ob = new Test1();

        int a = 15, b = 20;

        System.out.println("a and b before call: " +
                a + " " + b);

        ob.noChange(a, b);

        System.out.println("a and b after call: " +
                a + " " + b);
    }
}
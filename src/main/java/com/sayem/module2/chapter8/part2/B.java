package com.sayem.module2.chapter8.part2;

// A's j is not accessible here.
class B extends A {
    int total;

    void sum() {
        //total = i + j; // ERROR, j is not accessible here
    }
}
package com.sayem.module1.chapter13;

// Here, T is bound by Object by default.
class Gen<T> {
    T ob; // here, T will be replaced by Object

    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}
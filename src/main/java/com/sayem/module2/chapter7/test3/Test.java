package com.sayem.module2.chapter7.test3;

// Objects are passed through their references.

class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // pass an object
    void meth(Test o) {
        o.a *=  2;
        o.b /= 2;
    }
}
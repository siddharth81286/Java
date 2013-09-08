package com.sayem.chapter7;

class X {
    int a;

    X(int i) { a = i; }
}

class Y extends X {
    int b;

    Y(int i, int j) {
        super(j);
        b = i;
    }
}

class IncompatibleRef {
    public static void main(String args[]) {
        X x = new X(10);
        X x2;
        //Y y = new Y(5);

        x2 = x; // OK, both of same type

        //x2 = y; // Error, not of same type
    }
}

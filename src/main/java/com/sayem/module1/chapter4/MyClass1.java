package com.sayem.module1.chapter4;

class MyClass1 {
    int x;

    MyClass1(int i) {
        x = i;
    }
}

class ParmConsDemo {
    public static void main(String args[]) {
        MyClass1 t1 = new MyClass1(10);
        MyClass1 t2 = new MyClass1(88);

        System.out.println(t1.x + " " + t2.x);
    }
}
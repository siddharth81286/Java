package com.sayem.module1.chapter7;

class Shapes7 {
    public static void main(String args[]) {
        Triangle t1 =
                new Triangle("outlined", 8.0, 12.0);

        // make a copy of t1
        Triangle t2 = new Triangle(t1);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}

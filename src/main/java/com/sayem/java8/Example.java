package com.sayem.java8;


interface Calculator{
    int calculate(int x, int y);
}

public class Example {
    public static void main(String[] args) {

        Calculator calculator = (x, y) -> x + y;
        System.out.println(calculator.calculate(5, 6));

    }
}

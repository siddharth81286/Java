package com.sayem.module1.chapter1;

class BlockDemo {
    public static void main(String args[]) {
        double i, j, d;

        i = 5;
        j = 10;

        // the target of this if is a block
        if(i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.print("j / i is " + d);
        }
    }
}
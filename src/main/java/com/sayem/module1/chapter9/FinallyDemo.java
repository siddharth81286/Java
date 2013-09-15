package com.sayem.module1.chapter9;

class FinallyDemo {
    public static void main(String args[]) {

        for(int i=0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
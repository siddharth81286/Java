package com.sayem.projects.banking;


public class Account {

    private double balance = 100;
    private String accountNumber;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(double balance, String accountNumber) {

        if (balance >= 100) {
            this.balance = balance;
        }else{
            balance = 100;
        }

        this.accountNumber = accountNumber;
    }

    public void deposit(double howMuch){

        if (howMuch > 0){
            balance = balance + howMuch;
        }else{
            System.out.println("Please ensure the amount to be deposited is not negative.");
        }
    }

    public void withdraw(){

    }
}

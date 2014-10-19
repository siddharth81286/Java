package com.sayem.projects.banking;

public class Bank {

    private double interestRate = 8.5;
    private double transactionFees = 10;
    private Customer[] customers;

    public double getInterestRate() {
        return interestRate;
    }

    public double getTransactionFees() {
        return transactionFees;
    }
}

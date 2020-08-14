package com.github.perschola;

public class Account {
    private double balance = 50.0d;

    public double withdraw(Double amount){
        balance = balance - amount;
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}

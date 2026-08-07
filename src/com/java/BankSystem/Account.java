package com.java.BankSystem;

public class Account {
    private int balance;
    private Customer customer;

    public Account(Customer customer, int balance) {
        this.customer = customer;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void updateBalance(int amount) {
        balance += amount;
    }
}

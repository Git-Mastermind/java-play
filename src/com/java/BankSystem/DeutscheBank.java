package com.java.BankSystem;

public class DeutscheBank {
    public Customer newCustomer(String name) {
        Customer customer = new Customer(name);
        return customer;
    }

    public Account newBankAccount(String name, int balance) {
        Account account = new Account(balance);
        return account;
    }


    public int getBalance(Account account) {
        return account.getBalance();
    }
}

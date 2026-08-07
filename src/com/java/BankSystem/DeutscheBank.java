package com.java.BankSystem;

public class DeutscheBank {
    public Customer newCustomer(String name) {
        Customer customer = new Customer(name);
        return customer;
    }
}

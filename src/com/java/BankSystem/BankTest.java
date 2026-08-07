package com.java.BankSystem;

public class BankTest {
    public static void main(String[] args) {
        DeutscheBank bank = new DeutscheBank();
        Customer eshan = bank.newCustomer("Eshan");
        Account eshanAccount = bank.newBankAccount(eshan, 6_053);
        bank.deposit(eshanAccount, 1_500);
        bank.withdraw(eshanAccount, 500);
        System.out.println(bank.getBalance(eshanAccount));
    }
}

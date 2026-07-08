package com.datastructures.JavaBookExercises.PaymentsPolymorphismPractice;

public class PaymentProcessor {
    public void authorize(int cardNumber) {
        Network cardNetwork = new Network();

        cardNetwork.routeToBank(cardNumber);
    }

    public void isAuthorized(boolean isAuthorized) {
        CashRegister cashRegister = new CashRegister();

        cashRegister.isAuthorized(isAuthorized);

    }
}

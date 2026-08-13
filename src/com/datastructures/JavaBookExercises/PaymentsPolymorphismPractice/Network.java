package com.datastructures.javabookexercises.PaymentsPolymorphismPractice;

public class Network {
    public void routeToBank(int cardNumber) {
        IssuingBank issuingBank = new IssuingBank();
        issuingBank.finalizePayment(cardNumber);
    }

    public void isAuthorized(boolean isAuthorized) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.isAuthorized(isAuthorized);
    }
}

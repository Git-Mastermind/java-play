package com.datastructures.javabookexercises.PaymentsPolymorphismPractice;

public class IssuingBank {
    public void finalizePayment(int cardNumber) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.isAuthorized(true);
    }
}

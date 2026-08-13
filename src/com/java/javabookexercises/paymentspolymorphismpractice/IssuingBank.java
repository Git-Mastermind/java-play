package com.java.javabookexercises.paymentspolymorphismpractice;

public class IssuingBank {
    public void finalizePayment(int cardNumber) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.isAuthorized(true);
    }
}

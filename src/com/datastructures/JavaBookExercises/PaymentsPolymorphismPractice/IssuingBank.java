package com.datastructures.JavaBookExercises.PaymentsPolymorphismPractice;

public class IssuingBank {
    public void finalizePayment(int cardNumber) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.isAuthorized(true);
    }
}

package com.datastructures.JavaBookExercises.PaymentsPolymorphismPractice;

public class CashRegister {
    public void swipeCard(int cardNumber) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.authorize(cardNumber);
    }

    public void isAuthorized(boolean isAuthorized) {
        if (isAuthorized) {
            System.out.println("✅ Payment Approved!");
        } else {
            System.out.println("❌ Payment Declined");
        }
    }
}

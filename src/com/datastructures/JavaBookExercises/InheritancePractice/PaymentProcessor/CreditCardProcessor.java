package com.datastructures.JavaBookExercises.InheritancePractice.PaymentProcessor;

public class CreditCardProcessor extends PaymentProcessor{
    int merchant_id = 0;
    float rate = 0;
    int totalBill = 0;
    

    public CreditCardProcessor(int merchant_id, float rate, int totalBill) {
        super(merchant_id, rate, totalBill);
        this.rate = rate;
    }

    public float calculateTotalExpense() {
        return super.calculateTotalExpense() + (super.calculateTotalExpense() * rate);
    }
}

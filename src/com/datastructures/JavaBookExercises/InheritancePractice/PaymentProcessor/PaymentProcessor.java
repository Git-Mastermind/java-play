package com.datastructures.JavaBookExercises.InheritancePractice.PaymentProcessor;

public class PaymentProcessor {
    private int merchant_id = 0;
    private float rate = 0;
    float totalBill = 0;

    public PaymentProcessor(int merchant_id, float rate, int totalBill) {
        this.merchant_id = merchant_id;
        this.rate = rate;
        this.totalBill = totalBill;
    }

    public float calculateTotalExpense() {
        return totalBill + (totalBill * rate);
    }


}

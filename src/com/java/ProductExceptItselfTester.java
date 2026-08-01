package com.java;

public class ProductExceptItselfTester {
    public static void main(String[] args) {
        ProductExceptItself testProductExceptItself = new ProductExceptItself();
        int[] inputArray = new int[5];
        inputArray[0] = -3;
        inputArray[1] = 2;
        inputArray[2] = 1;
        inputArray[3] = 1;
        inputArray[4] = 6;
        testProductExceptItself.productExceptItself(inputArray);
    }
}

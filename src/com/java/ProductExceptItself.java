package com.java;

public class ProductExceptItself {

    public void turnArrayIntoReadable(int[] inputArray) {
        for (int i : inputArray) {
            System.out.println(i);
        }
    }
    public void productExceptItself(int[] inputArray) {
        int product = 1;
        int[] resultList = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (j != i) {
                    product *= inputArray[j];
                }
            }
            resultList[i] = product;
            product = 1;
        }
        this.turnArrayIntoReadable(resultList);
    }
}

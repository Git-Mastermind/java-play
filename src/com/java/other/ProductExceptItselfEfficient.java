package com.java.other;
import java.util.Arrays;

public class ProductExceptItselfEfficient {
    public void productExceptItselfEfficient(int[] inputArray) {
        int product = 1;
        int zeroCount = 0;
        int[] resultArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0) {
                zeroCount++;
            }
            else {
                product *= inputArray[i];
            }
        }
        if (zeroCount != 0) {
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] == 0) {
                    resultArray[i] = product;
                }
                else {
                    resultArray[i] = 0;
                }
            }
        }
        else {
            for (int i = 0; i < inputArray.length; i++) {
                resultArray[i] = product / inputArray[i];
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }
}

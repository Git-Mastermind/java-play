package com.datastructures.tests.datastructurestests.recursiontests;

import com.datastructures.recursion.Recursion;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        String str = "EshanJha";
        int num1 = 5;
        int num2 = 8;
        int multiplyResult = recursion.multiplyRecursive(num1, num2);
        System.out.println("Normal: " + num1 * num2);
        System.out.println(multiplyResult);
    }
}

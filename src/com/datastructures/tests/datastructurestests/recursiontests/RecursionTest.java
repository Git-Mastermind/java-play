package com.datastructures.tests.datastructurestests.recursiontests;

import com.datastructures.recursion.Recursion;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int num = 7;
        int result = recursion.fibbonaci(num);
        System.out.println(result);
    }
}

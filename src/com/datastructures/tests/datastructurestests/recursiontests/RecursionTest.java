package com.datastructures.tests.datastructurestests.recursiontests;

import com.datastructures.recursion.Recursion;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        String str = "EshanJha";
        int counter = 0;
        int index = 0;
        recursion.lengthOfStringRecursive(str, index, counter);
    }
}

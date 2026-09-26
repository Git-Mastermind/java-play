package com.datastructures.tests.datastructurestests.recursiontests;

import com.datastructures.recursion.Recursion;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        String str = "ilovecoDing";
        recursion.uppercaseLetterInStringRecursive(str, 0);
    }
}

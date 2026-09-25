package com.datastructures.tests.datastructurestests.recursiontests;

import com.datastructures.recursion.Recursion;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        String str = "ilovecoDing";
        char firstUppercaseChar = recursion.uppercaseLetterInStringIterative(str);
        System.out.println(firstUppercaseChar);
    }
}

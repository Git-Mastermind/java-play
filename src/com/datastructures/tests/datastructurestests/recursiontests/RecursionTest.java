package com.datastructures.tests.datastructurestests.recursiontests;

import com.datastructures.recursion.Recursion;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        String str = "EshanJha";
        int index = 0;
        int consonents = recursion.findAllConsonentsIterative(str);
        System.out.println(consonents);
    }
}

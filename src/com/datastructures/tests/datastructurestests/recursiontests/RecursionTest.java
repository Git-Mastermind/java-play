package com.datastructures.tests.datastructurestests.recursiontests;

import com.datastructures.recursion.Recursion;
import java.util.List;
import java.util.ArrayList;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int num = 1;
        int[] listedLint = recursion.convertNumberToDigits(num);
        recursion.printArray(listedLint);
    }
}

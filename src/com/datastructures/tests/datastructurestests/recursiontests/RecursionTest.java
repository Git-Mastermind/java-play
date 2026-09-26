package com.datastructures.tests.datastructurestests.recursiontests;

import com.datastructures.recursion.Recursion;
import java.util.List;
import java.util.ArrayList;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int digitSum = recursion.digitSum(42891);
        System.out.println(digitSum);
   }
}
 
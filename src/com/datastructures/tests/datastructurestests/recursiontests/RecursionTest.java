package com.datastructures.tests.datastructurestests.recursiontests;

import com.datastructures.recursion.Recursion;
import java.util.List;
import java.util.ArrayList;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        List<Integer> array = new ArrayList<>(List.of(1,7,2,5));

        int lengthOfArray = recursion.lengthOfArray(array, 0);
        System.out.println(lengthOfArray);
    }
}
 
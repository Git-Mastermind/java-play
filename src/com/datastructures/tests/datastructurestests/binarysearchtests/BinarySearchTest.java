package com.datastructures.tests.datastructurestests.binarysearchtests;

import com.datastructures.binarysearch.BinarySearch;
import java.util.List;
import java.util.ArrayList;

public class BinarySearchTest {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = { -14, -10, 0, 100, 108, 108, 200, 580, 900 };
        int[] powers = binarySearch.integerSquareRoot(12);
        binarySearch.arrayPrint(powers);
    }
}

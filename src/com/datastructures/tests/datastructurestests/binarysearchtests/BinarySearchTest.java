package com.datastructures.tests.datastructurestests.binarysearchtests;

import com.datastructures.binarysearch.BinarySearch;
import java.util.List;
import java.util.ArrayList;

public class BinarySearchTest {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = { 3,5,2,3,59,2,1,7 };
        List<Integer> result = binarySearch.findFixedPoint(nums);
        System.out.println(result);
    }
}

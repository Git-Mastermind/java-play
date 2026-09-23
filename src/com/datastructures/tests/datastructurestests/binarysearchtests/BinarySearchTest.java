package com.datastructures.tests.datastructurestests.binarysearchtests;

import com.datastructures.binarysearch.BinarySearch;

public class BinarySearchTest {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = { 1,2,3,4,5,6,7,8,9 };
        boolean result = binarySearch.binarySearch2(nums, 100);
        System.out.println(result);
    }
}

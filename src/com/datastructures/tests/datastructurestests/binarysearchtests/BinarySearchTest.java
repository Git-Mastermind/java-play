package com.datastructures.tests.datastructurestests.binarysearchtests;

import com.datastructures.binarysearch.BinarySearch;
import java.util.List;
import java.util.ArrayList;

public class BinarySearchTest {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = { 1,2,3,4,5,5,6,7,8,9 };
        int result = binarySearch.findFixedPointsFaster(nums);
        System.out.println(result);
    }
}

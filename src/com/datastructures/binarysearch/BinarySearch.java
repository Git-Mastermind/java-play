package com.datastructures.binarysearch;

public class BinarySearch {
    public boolean binarySearch(int[] toSearch, int valueToSearch) {
        long startTime = System.nanoTime();
        int low = 0;
        int high = toSearch.length - 1;
        int mid;

        while (low <= high) {
            mid = Math.floorDiv((low + high), 2);

            if (toSearch[mid] == valueToSearch) {
                long endTime = System.nanoTime();
                System.out.println("Execution time: " + (endTime - startTime));
                return true;

            } else if (toSearch[mid] > valueToSearch) {
                high = mid - 1;
            } else if (toSearch[mid] < valueToSearch) {
                low = mid + 1;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime));
        return false;
    }

    public boolean linearSearch(int[] toSearch, int valueToSearch) {
        long startTime = System.nanoTime();
        for (int num : toSearch) {
            if (num == valueToSearch) {
                long endTime = System.nanoTime();
                System.out.println("Execution time: " + (endTime - startTime));
                return true;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Time to execute: " + (endTime - startTime));
        return false;
    }

    public boolean binarySearch2(int[] nums, int numberToFind) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = Math.floorDiv((low + high), 2);
            if (numberToFind == nums[mid]) {
                return true;
            }
            else if (numberToFind < nums[mid]) {
                high = mid - 1;
            }
            else if (numberToFind > nums[mid]) {
                low = mid + 1;
            }
        }
        return false;
    }
}

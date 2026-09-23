package com.datastructures.binarysearch;

import java.util.ArrayList;
import java.util.List;

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
            } else if (numberToFind < nums[mid]) {
                high = mid - 1;
            } else if (numberToFind > nums[mid]) {
                low = mid + 1;
            }
        }
        return false;
    }

    public int findClosestNumberInArray(int[] nums, int target) {
        List<Integer> usedNumbers = new ArrayList<>();
        int low = 0;
        int high = nums.length - 1;
        int mid;
        int right;
        int left;
        int minimumDifferenceLeft;
        int minimumDifferenceRight;

        while (low <= high) {
            mid = Math.floorDiv((low + high), 2);
            right = nums[mid + 1];
            usedNumbers.add(right);
            left = nums[mid - 1];
            usedNumbers.add(left);
            minimumDifferenceLeft = left - target;
            minimumDifferenceRight = right - target;

            if (minimumDifferenceRight  >= minimumDifferenceLeft) {
                high = mid - 1;
            }
            else if (minimumDifferenceLeft < minimumDifferenceRight) {
                low = mid + 1;
            }
        }
        // work in progress
        return 0;

    }

    public List<Integer> findFixedPoint(int[] nums) {
        List<Integer> fixedPoints = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                fixedPoints.add(i);
            }
        }
        return fixedPoints;
    }

    public int findFixedPointsFaster(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid;

        while (low <= high) {
            mid = Math.floorDiv((low + high), 2);

            if (nums[mid] == mid) {
                return mid;
            }
            else if (nums[mid] > mid) {
                low = mid + 1;
            }
            else if (nums[mid] < mid) {
                high = mid - 1;
            }
        }
        return nums[low];
    } 

    public int findBitonicPeak(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        int left;
        int right;

        while (low <= high) {
            mid = Math.floorDiv((low + high), 2);
            left = nums[mid - 1];
            right = nums[mid + 1];

            if (left > nums[mid] && nums[mid] > right) {
                high = mid - 1;
            }
            else if (left > nums[mid] && nums[mid] < right) {
                low = mid + 1;
            }
            else if (left < nums[mid] && nums[mid] > right) {
                return nums[mid];
            }
        }
        return nums[low];
    }   

    public int findFirstOccuranceOf(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;

        while (low <= high) {
            mid = Math.floorDiv((low + high), 2);

            if (nums[mid] == target) {
                if (nums[mid - 1] == target) {
                    return mid - 1;
                }
                return mid;
            }

            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else if (nums[mid] < target) {
                high = mid - 1;
            }
        }
        return -1;
    }
}

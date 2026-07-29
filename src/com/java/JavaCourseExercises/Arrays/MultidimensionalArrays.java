package com.java.JavaCourseExercises.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {5,6,7,8};
        int[] nums3 = {9,10,11,12};

        int[][] arrayOfNums = {nums1, nums2, nums3};
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println(arrayOfNums[i][j]);
            }

        }
    }
}

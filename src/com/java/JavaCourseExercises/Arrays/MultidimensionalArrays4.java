package com.java.JavaCourseExercises.Arrays;


public class MultidimensionalArrays4 {
    public static void main(String[] args) {
        int[][] nums = new int[3][4];

        for (int i[] : nums) {
            for (int j : i) {
                j = (int) (Math.random() * 100);
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
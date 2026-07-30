package com.java.JavaCourseExercises.Arrays;

public class MultidimensionalArrays2 {
    public static void main(String[] args) {
        int[][] nums4 = new int[3][4];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(nums4[i][j] + " ");
            }
            System.out.println();
        }
    }
}

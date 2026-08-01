package com.java.JavaCourseExercises;

public class ForEachLoop {
    public static void main(StringPractice[] args) {
        int[] nums = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        for (int num : nums) {
            System.out.println(num);
        }
    }
}

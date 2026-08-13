package com.java.JavaCourseExercises;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;

public class ForEachList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        Consumer<Integer> consumer = n -> {
            if (n%2==0) {
                System.out.println(n + " --- Even");
            }
            else {
                System.out.println(n + " --- Odd");
            }
            
        };

        nums.forEach(consumer);
    }
}

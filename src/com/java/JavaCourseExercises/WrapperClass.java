package com.java.JavaCourseExercises;

public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num;
        int num2 = num1.intValue();
        System.out.println(num2);
    }
}

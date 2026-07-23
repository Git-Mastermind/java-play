package com.java.JavaCourseExercises;

public class TypePromotion {
    public static void main(String[] args) {
        byte a = 90; 
        byte b = 80;

        int result = a * b; // result of byte multiplication goes outside of byte range so it gets promoted to integer: TYPE CONVERSION
        System.out.println(result);
    }
}

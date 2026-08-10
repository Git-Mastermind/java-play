package com.java.JavaCourseExercises.Interface.Lambda;

@FunctionalInterface
interface A {
    int add(int num1, int num2);
}

public class Demo {
    public static void main(String[] args) {
        A obj = (i,j) -> i + j;
        int result = obj.add(5,4);
        System.out.println(result);
    }

    
}

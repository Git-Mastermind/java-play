package com.java.JavaCourseExercises;

public class ArithmeticTests {
    public static void main(String[] args) {
        byte num = 7;

        byte result = ++num; // first increment num then assign incremented num to result
        byte otherResult = num++; // first assign num to otherResult and then increment num by one

        System.out.println(num);
        System.out.println(result);

        System.out.println(num);
        System.out.println(otherResult);
    }
}

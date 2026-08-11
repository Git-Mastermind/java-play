package com.java.JavaCourseExercises.TryCatch;

public class Demo2 {
    public static void main(String[] args) {
        try {
            Class.forName("Demo.java");
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}

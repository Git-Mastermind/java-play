package com.java.JavaCourseExercises.TryCatch;

public class Demo {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        try {
            j = 18/i;
            System.out.println(j);
        }

        catch(Exception exception) {
            System.out.println("Exception! Caught " + exception);
        }

    }
}

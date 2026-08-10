package com.java.JavaCourseExercises.TryCatch;


public class Demo {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if (i > 18) {
                throw new ArithmeticException();
            }
        }

        catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("defalting...");
        }
        catch (Exception e) {
            System.out.println("Something went wrong...");
        }
        System.out.println(j);

    }
}

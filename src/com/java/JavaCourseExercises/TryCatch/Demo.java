package com.java.JavaCourseExercises.TryCatch;
import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("index: ");
            int index = scanner.nextInt();
            if (index < 0) {
                throw new IndexIsNegativeException("index is negative");
            }
        }
        catch (IndexIsNegativeException e) {
            System.out.println("index is negative" + e);
        }

    }
}

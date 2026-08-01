package com.java.JavaCourseExercises;

public class ForLoopPractice {
    public static void main(StringPractice[] args)
    {
        for (int i = 1; i <= 7; i++) 
        {
            System.out.println("DAY " + i);
            for (int j = 1; j <= 24; j++)
            {
                System.out.println("HOUR " + j);
            }
        }
    }
}

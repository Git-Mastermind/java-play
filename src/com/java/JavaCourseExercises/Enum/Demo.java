package com.java.JavaCourseExercises.Enum;

enum Status {
    Running, Pending, Failed, Success;
}

public class Demo {
    public static void main(String[] args) {
        Status[] statusOptions = Status.values();
    
        for (Status status : statusOptions) {
            System.out.println(status);
        }
    }
}

package com.java.JavaCourseExercises.Enum;

enum Status {
    Running, Pending, Failed, Success;
}

public class Demo {
    public static void main(String[] args) {
        Status status = Status.Success;
        System.out.println(status);
    }
}

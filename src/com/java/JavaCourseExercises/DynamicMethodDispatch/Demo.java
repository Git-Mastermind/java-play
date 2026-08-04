package com.java.JavaCourseExercises.DynamicMethodDispatch;

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

    }
}

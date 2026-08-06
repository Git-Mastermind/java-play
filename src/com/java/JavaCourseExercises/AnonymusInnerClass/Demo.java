package com.java.JavaCourseExercises.AnonymusInnerClass;

public class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in new show");
            }
        };

        A obj1 = new A() {
            public void show() {
                System.out.println("in obj1 show");
            }
        };

        obj1.show();
    }
}

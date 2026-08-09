package com.java.JavaCourseExercises.Interface;


@FunctionalInterface
interface A {
    void show();
}


public class Demo2 {
    public static void main(String[] args ) {
        A obj = new A() {
            public void show() {
                System.out.println("in implemented show");
            }
        };
        obj.show();
    }
    
}

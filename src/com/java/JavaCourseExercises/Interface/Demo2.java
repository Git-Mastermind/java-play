package com.java.JavaCourseExercises.Interface;


@FunctionalInterface
interface A {
    void show(int i);
}


public class Demo2 {
    public static void main(String[] args ) {
        A obj = i -> System.out.println("in implemented lambda show" + i);
        obj.show(5);
    }
    
}

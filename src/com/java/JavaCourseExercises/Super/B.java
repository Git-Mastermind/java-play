package com.java.JavaCourseExercises.Super;

public class B extends A {
    public B() {    
        this(5);
        System.out.println("in B");
    }

    public B(int n) {
        super();
        System.out.println("in B int");
    }
}

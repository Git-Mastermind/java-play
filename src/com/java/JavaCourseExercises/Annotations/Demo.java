package com.java.JavaCourseExercises.Annotations;

class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in a show");
    }
}

class B extends A {
    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in b show");
    }
}   

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}

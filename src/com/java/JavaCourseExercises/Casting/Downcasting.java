package com.java.JavaCourseExercises.Casting;

class A {
    public void showA() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void showB() {
        System.out.println("in B show");
    }
}


public class Downcasting {
    public static void main(String[] args) {
       B obj = (B) new A();
        obj.showB();
    }
}

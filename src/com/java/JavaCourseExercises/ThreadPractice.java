package com.java.JavaCourseExercises;

class A {
    public void show() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi");
        }
        
    }
}

class B {
    public void show() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");
        }
        
    }
}

public class ThreadPractice {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.show();
        b.show();
        
    }
}

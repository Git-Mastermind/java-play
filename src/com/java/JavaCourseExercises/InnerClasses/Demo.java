package com.java.JavaCourseExercises.InnerClasses;

class A {
    int num;

    public void hello() {
        System.out.println("hello");
    }

    static class B {
        String name;

        public void config() {
            System.out.println("in config"); 
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.hello();

        A.B obj1 = new A.B();
        obj1.config();

        

    }
}

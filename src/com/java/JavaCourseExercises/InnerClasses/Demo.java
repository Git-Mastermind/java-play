package com.java.JavaCourseExercises.InnerClasses;

class Human {
    int age;
    String name;

    public void hello() {
        System.out.println("hello");
    }

    class Arm {
        int numOfFingers;

        public void config() {
            System.out.println("in config"); 
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Human eshan = new Human();
        eshan.hello();

    }
}

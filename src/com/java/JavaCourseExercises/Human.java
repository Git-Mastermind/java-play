package com.java.JavaCourseExercises;

public class Human {
    private int age;
    private String name;

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
        System.out.print("in constructor");
    }




    public int age() {
        return age;
    }

    public String name() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
 }

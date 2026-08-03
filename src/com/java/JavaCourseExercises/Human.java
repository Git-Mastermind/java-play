package com.java.JavaCourseExercises;

public class Human {
    private int age;
    private String name;
    private int studentid;


    public Human(int studentid, int age) {
        this.studentid = studentid;
        this.age = age;
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

package com.java.JavaCourseExercises.Developer;

public class Laptop implements WorkableMachines {

    String brand;

    public Laptop(String brand) {
        this.brand = brand;
    }
    public void code() {
        System.out.println("coding..");
    }

    @Override
    public String toString() {
        return this.brand;
    }
 }
package com.java.JavaCourseExercises.Developer;

public class Desktop implements WorkableMachines{
    String brand;

    public Desktop(String brand) {
        this.brand = brand;
    }
    public void code() {
        System.out.println("coding - faster");
    }

    @Override
    public String toString() {
        return this.brand;
    }
}

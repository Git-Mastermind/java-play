package com.java.JavaCourseExercises.AbstractPractice;

public class Tesla extends CarAudioSpecialist {
    public void drive() {
        System.out.println("eeeeeeeee...");
    }

    public void brake() {
        System.out.println("regen braking...");
    }

    public void turn(String direction) {
        System.out.println("turning " + direction + "...");
    }
}

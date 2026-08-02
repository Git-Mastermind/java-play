package com.java.JavaCourseExercises.Static;

public class Phone {
    public String brand;
    public int price;
    public static String name;

    static {
        name = "Phone";
        System.out.println("in static");
    }

    public Phone() {
        System.out.println("in contructor");
    }
}

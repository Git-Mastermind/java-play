package com.java.JavaCourseExercises.Object;

public class Demo {
    public static void main(String[] args) {
        Laptop macbook = new Laptop( "Air M5 15 inch", 1300);
        Laptop macbook1 = new Laptop( "Air M5 13 inch", 1300);

        System.out.println(macbook.equals(macbook1));
    }
    

}

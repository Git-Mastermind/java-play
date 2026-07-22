package com.java.JavaCourseExercises;

public class Welcome {
    public static void main(String[] args) {
        StringBuilder helloName = new StringBuilder("Hello Eshan");
        StringBuilder helloJava = helloName;
        System.out.println(helloName);
        helloName.append(" and Hello Java");
        System.out.println(helloJava);
        
    }
}

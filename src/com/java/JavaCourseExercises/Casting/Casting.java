package com.java.JavaCourseExercises.Casting;

public class Casting {
    public static void main(String[] args) {
        byte b = 90;
        int a = 900;

        a = b; // is valid because b is a smaller value than a and can fit in the integer range
        b = a; // is not valid because a is larger than b and you can't fit a large range into a smaller range
        b = (byte) a; // is valid because a is being converted into 8 bits of memory by a process called truncation
        
    }
}

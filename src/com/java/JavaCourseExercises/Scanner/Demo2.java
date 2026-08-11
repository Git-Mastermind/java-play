package com.java.JavaCourseExercises.Scanner;
import java.io.IOException;
import java.lang.reflect.InaccessibleObjectException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Demo2 {
    public static void main(String[] args) {
        String num = "";
        System.out.print("Enter a number: ");


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            num = bf.readLine();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(num);
        try {
            bf.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Bye");
        }

    }
}

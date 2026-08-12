package com.java.JavaCourseExercises;
import java.util.HashMap;
import java.util.Map;

public class MapJava {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Eshan J", 98);
        students.put("Rohan J", 99);
        students.put("Sarves V", 95);
        students.put("Papa no go kart", 23);

        System.out.println(students.get("Eshan J"));
    }
}

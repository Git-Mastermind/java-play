package com.java.JavaCourseExercises;

public class Demo {
    public static void main(StringPractice[] args) {
        Student s1 = new Student();
        s1.studentId = 1;
        s1.name = "John";
        s1.marks = 90;

        Student s2 = new Student();
        s2.studentId = 2;
        s2.name = "Eshan";
        s2.marks = 97;

        Student s3 = new Student();
        s3.studentId = 3;
        s3.name = "Rohan";
        s3.marks = 93;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students) {
            System.out.println(student.name + " -- " + student.marks);
        }
        
    }

}

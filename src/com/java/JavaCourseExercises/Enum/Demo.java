package com.java.JavaCourseExercises.Enum;
import java.lang.Enum;

enum Status {
    Running, Pending, Failed, Success;
}

public class Demo {
    public static void main(String[] args) {
        Status status = Status.Success;

        switch (status) {
            case Running:
                System.out.println("Please wait..");
                break;
            case Pending:
                System.out.println("Pending..");
                break;
            case Failed:
                System.out.println("Please try again later (failed)");
                break;
            case Success:
                System.out.println("Success!!");
                break;
        }

    }
}

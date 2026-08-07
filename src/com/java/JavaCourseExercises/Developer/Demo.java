package com.java.JavaCourseExercises.Developer;

import java.util.concurrent.DelayQueue;

public class Demo {
    public static void main(String[] args) {
        Developer eshan = new Developer();
        WorkableMachines macbookPro = new Laptop("macbookPro");
        WorkableMachines macStudio = new Desktop("Mac Studio");

        eshan.developeApp(macbookPro);

    }
}

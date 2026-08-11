package com.java.JavaCourseExercises;

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi");
            
            try {
                Thread.sleep(400);
            }
            catch (InterruptedException e) {
                System.out.println("Sleep was interrupted!");
            }
            catch (Exception e) {
                System.out.println("Something went wrong");
            }

        }
        
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");

        try {
            Thread.sleep(400);
        }
        catch (InterruptedException e) {
            System.out.println("Sleep was interrupted!");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
            
        }
        
    }
}

public class ThreadPractice {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        b.setPriority(Thread.MAX_PRIORITY);

        a.start();
        b.start();
        
    }
}

package com.java.JavaCourseExercises;

// class A implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println("Hi");
            
//             try {
//                 Thread.sleep(1);
//             }
//             catch (InterruptedException e) {
//                 System.out.println("Sleep was interrupted!");
//             }
//             catch (Exception e) {
//                 System.out.println("Something went wrong");
//             }

//         }
        
//     }
// }

// class B implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println("Hello");

//         try {
//             Thread.sleep(1);
//         }
//         catch (InterruptedException e) {
//             System.out.println("Sleep was interrupted!");
//         }
//         catch (Exception e) {
//             System.out.println("Something went wrong");
//         }
            
//         }
        
//     }
// }

public class ThreadPractice {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i<=5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i<=5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
            
    }
}
        


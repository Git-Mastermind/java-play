package com.java.JavaCourseExercises.Enum;

public class EnumClassPractice {
    public static void main(String[] args) {
        enum Macbook {
            Air(1300), Pro(3000), ProAirChip(2000), BetterPro(7000);
            
            private int price;

            private Macbook(int price) {
                this.price = price;
            }
        }

        Macbook macbook = Macbook.Air;
        System.out.println(macbook.price);
    }
}

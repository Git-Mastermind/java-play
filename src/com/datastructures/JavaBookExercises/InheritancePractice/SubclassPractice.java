package com.datastructures.JavaBookExercises.InheritancePractice;

public class SubclassPractice extends SuperclassPractice {

    String name = "Smith John";
    public void greeting() {
        super.greeting();
        System.out.println("Greetings once again!");
    }


    public static void main(String[] args) {
        SubclassPractice subclass = new SubclassPractice();
        System.out.println(subclass.name);
    }
}

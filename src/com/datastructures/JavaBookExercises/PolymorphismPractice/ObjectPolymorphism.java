package com.datastructures.JavaBookExercises.PolymorphismPractice;

public class ObjectPolymorphism {

    Dog dog = new Dog();

    Dog dog1 = this.getObject(dog);
    public Object getObject(Object o) {
        return o;
    }
}

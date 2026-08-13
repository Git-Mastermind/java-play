package com.datastructures.javabookexercises.PolymorphismPractice;

public class ObjectPolymorphism {

    Dog dog = new Dog();

    Object dog1 = this.getObject(dog);
    public Object getObject(Object o) {
        return o;
    }
}
 
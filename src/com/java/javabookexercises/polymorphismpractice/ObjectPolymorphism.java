package com.java.javabookexercises.polymorphismpractice;

public class ObjectPolymorphism {

    Dog dog = new Dog();

    Object dog1 = this.getObject(dog);
    public Object getObject(Object o) {
        return o;
    }
}
 
package com.datastructures.javabookexercises.inheritancepractice.AnimalFarm;

public abstract class Animal {
    public abstract void makeNoise();

    public abstract void eat();

    public void sleep() {
        System.out.println("zzzzz");
    }

    public abstract void roam();
}

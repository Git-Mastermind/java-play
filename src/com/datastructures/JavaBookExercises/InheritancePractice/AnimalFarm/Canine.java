package com.datastructures.JavaBookExercises.InheritancePractice.AnimalFarm;

public abstract class Canine extends Animal {
    @Override
    public void roam() {
        System.out.println("Digitigrade");
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
}

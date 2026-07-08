package com.datastructures.JavaBookExercises.InheritancePractice.AnimalFarm;

public abstract class Feline extends Animal {
    @Override
    public void roam() {
        System.out.println("Pacing Gait");
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }

}

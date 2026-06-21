package com.datastructures.JavaBookExercises.AnimalFarm;

public class Hippo extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Wheeze honk!");
    }

    @Override
    public void eat() {
        System.out.println("Grass");
    }

    @Override
    public void roam() {
        System.out.println("Trot");
    }
}

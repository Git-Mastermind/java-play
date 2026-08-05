package com.java.JavaCourseExercises.Object;

public class Laptop {
    String model; 
    int price;

    public Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return this.model + " -- " + this.price;
    }

    public boolean equals(Laptop obj) {
        return (this.model.equals(obj.model) && this.price == obj.price);
    }
}

package com.epicode.demoSpring.Esercizio;

public abstract class Article {

    protected int calories;
    protected double price;

    public Article(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

}

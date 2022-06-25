package com.Test01.Pizza;

public class FruitsPizza extends Pizza{
    private String fruits;

    public FruitsPizza() {
    }

    public FruitsPizza(String fruits) {
        this.fruits = fruits;
    }

    public FruitsPizza(String name, int size, int price, String fruits) {
        super(name, size, price);
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return super.toString()+"披萨加入的水果："+fruits;
    }
}

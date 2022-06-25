package com.Test01.Pizza;

public class BaconPizza extends Pizza{
    private int weight;

    public BaconPizza() {
    }

    public BaconPizza(int weight) {
        this.weight = weight;
    }

    public BaconPizza(String name, int size, int price, int weight) {
        super(name, size, price);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString()+"披萨的克数："+weight;
    }
}

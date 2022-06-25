package com.Test01.Pizza;

public class Pizza {
    private String name;
    private int size;
    private int price;

    public Pizza() {
    }

    public Pizza(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "披萨的名称："+name+"\n"+"披萨的大小："+size+"\n"+"披萨的价格："+price+"\n";
    }
}

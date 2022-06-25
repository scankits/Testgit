package com.Test01.Pizza;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请选择披萨的种类：1.培根披萨  2.水果披萨");
        int choose = input.nextInt();

        Pizza pizza = Factory.getPizza(choose);
        System.out.println(pizza);
    }
}

package com.Test01.Pizza;

import java.util.Scanner;

public class Factory {
    public static Pizza getPizza(int choose){
        Pizza p = null;

        Scanner input = new Scanner(System.in);

        switch (choose){
            case 1: {
                System.out.print("请输入披萨的大小：");
                int size = input.nextInt();
                System.out.print("请输入披萨的价格：");
                int price = input.nextInt();
                System.out.print("请输入克数：");
                int weight = input.nextInt();

                BaconPizza bp = new BaconPizza("培根披萨", size, price, weight);

                p = bp;

                break;
            }

            case 2: {
                System.out.print("请输入披萨的大小：");
                int size = input.nextInt();
                System.out.print("请输入披萨的价格：");
                int price = input.nextInt();
                System.out.print("请输入加入的水果：");
                String fruits = input.next();

                FruitsPizza fp = new FruitsPizza("水果披萨", size, price, fruits);

                p = fp;

                break;
            }

            default:
                System.out.println("选择错误");
        }

        return p;
    }
}

package com.Test01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入被除数：");
        if (input.hasNextInt()){
            int num1 = input.nextInt();
            System.out.print("请输入除数：");
            if(input.hasNextInt()){
                int num2 = input.nextInt();
                if (num2 != 0){
                    System.out.println("商："+num1/num2);
                }else{
                    System.out.println("im");
                }
            }
        }else{
            System.out.println("请输入一个整数！");
        }


    }

}

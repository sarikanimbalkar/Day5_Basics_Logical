package com.bridgelabz.basics;

import java.util.Scanner;

public class FilpCoin {
    static double heads,tails;
    static  int h_count =0,t_count=0;
    static void FilpCoin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number To filp coin that no of times...");
        int num = sc.nextInt();
        for (int j = 0; j < num; j++) {
            double random = Math.random();
            if (random < 0.5)
                t_count++;
            else
                h_count++;
        }
        heads = h_count / (double) num * 100;
        tails = t_count / (double) num * 100;
        System.out.println("Percentage of head is : " + heads + "%");
        System.out.println("Percentage of tail is : " + tails + "%");
    }
    public static void main(String[] args) {
        FilpCoin();
    }
}

package com.bridgelabz.basics;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=sc.nextInt() ;
        System.out.println( "Factors of " + num + " are " );
        for(int i = 1; i*i <= num; i++)
        {
            if(num % i == 0)
                System.out.println(i + " ");
        }

    }
}

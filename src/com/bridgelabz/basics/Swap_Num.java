package com.bridgelabz.basics;

import java.util.Scanner;

public class Swap_Num {
    public static void main(String[] args) {
        int num1,num2,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two numbers for Swapping:");
        num1=sc.nextInt();
        num2= sc.nextInt();
        System.out.println("Before Swapping number is : ");
        System.out.println(" Num1 : " + num1 + " num2 : " + num2);
        if(num1>0)
        {
            temp=num1;
            num1=num2;
            num2=temp;
            System.out.println("After Swapping number : ");
            System.out.println(" Num1 : " + num1 + " Num2 : " + num2);
        }

    }
}

package com.bridgelabz.basics;

import java.util.Scanner;
public class Leap_Year {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year=sc.nextInt();
        if ( year%4 == 0 ) {
            System.out.println( year + " This Year is Leap Year... ");
        }
        else
            System.out.println( year + " This Year is not  Leap Year... ");

    }
}


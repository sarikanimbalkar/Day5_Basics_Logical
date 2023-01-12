package com.bridgelabz.basics;

import java.util.Scanner;

public class Vowel_Consonent {
    public static void main(String[] args) {
        char c;
        System.out.println("Enter Charector: ");
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);

        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
        {
            System.out.println( c + " This is vowel ");
        }
        else
            System.out.println("Consonant...");



    }
}

package com.company;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int FirstNumber,SecondNumber,ThirdNumber,FourthNumber;
        Scanner sc =new Scanner(System.in);
        System.out.println("Input first number :");
        FirstNumber=sc.nextInt();
        System.out.println("Input second number :");
        SecondNumber=sc.nextInt();
        System.out.println("Input third number :");
        ThirdNumber=sc.nextInt();
        System.out.println("Input fourth number :");
        FourthNumber=sc.nextInt();
        System.out.println("The sum is "+(FirstNumber+SecondNumber+ThirdNumber+FourthNumber));
    }
}

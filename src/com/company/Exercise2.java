package com.company;

import java.util.Scanner;

public class Exercise2 {
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
        if(FirstNumber==SecondNumber&&SecondNumber==ThirdNumber&&ThirdNumber==FourthNumber){
            System.out.println("Numbers are   equal!");
        }else {
            System.out.println("Numbers are not  equal!");
        }

    }

}

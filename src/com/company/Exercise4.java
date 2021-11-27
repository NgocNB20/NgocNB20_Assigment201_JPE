package com.company;

import java.util.Scanner;
import java.math.*;
public class Exercise4 {
    public static void main(String[] args) {
        double Radius,Height,SurfaceArea,BaseArea,Volume ;
        Scanner sc =new Scanner(System.in);
        System.out.println("Input Radius :");
        Radius=sc.nextDouble();
        System.out.println("Input Height :");
        Height=sc.nextDouble();
        BaseArea = Math.PI*Radius*Radius;
        SurfaceArea  =BaseArea*2  +  2*Math.PI*Radius*Height;
         Volume=BaseArea*Height;
        System.out.println("Base area     ="+BaseArea);
        System.out.println("Surface area  ="+SurfaceArea);
        System.out.println("Volume        ="+Volume);

    }
}

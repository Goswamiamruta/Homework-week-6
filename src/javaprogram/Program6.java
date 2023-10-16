package javaprogram;
/**
 * Write a program to enter any radius value of the circle and find out the area.
 * (Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter radious");
        double radious = scanner.nextDouble();
        double pi = 3.142;
        System.out.println("Area of Circle " + pi * radious * radious);
        scanner.close();
    }

}

package javaprogram;
/**
 * Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of Triangle");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of Triangle");
        double height = scanner.nextDouble();
        scanner.close();
        double area = 0 * base * height;
        System.out.println("The are of the Triangle is:"+ area);
    }
}

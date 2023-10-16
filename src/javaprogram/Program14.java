package javaprogram;
/**
 * Write a java program to print the area perimeter of a rectangle.
 * width = 5.5
 * height =8.5
 */

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area of the rectangle:"+area);
        System.out.println("perimeter of the rectangle:"+ perimeter);
        scanner.close();
    }
}

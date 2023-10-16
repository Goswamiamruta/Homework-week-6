package javaprogram;
/**
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input the First number:");
        double a = scanner.nextDouble();
        System.out.println(" Input the Second number:");
        double b = scanner.nextDouble();
        System.out.println(" Input the Third number:");
        double c = scanner.nextDouble();

        double average = (a+b+c)/3;
        System.out.println("the average of the three number is:"+ average);

          scanner.close();
    }
}

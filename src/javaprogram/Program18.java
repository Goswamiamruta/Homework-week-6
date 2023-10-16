package javaprogram;
/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 */

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();
        System.out.println(a + "+ " + b + "=" + (a+b)); // addition
        System.out.println(a + "- " + b + "=" + (a-b)); //multiply
        System.out.println(a + "* " + b + "=" + (a*b)); //subtract
        System.out.println(a + "/ " + b + "=" + (a/b)); //divide
        System.out.println(a + " % " + b + "=" + (a%b));//
        scanner.close();
    }
}

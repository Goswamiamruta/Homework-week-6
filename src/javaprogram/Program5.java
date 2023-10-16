package javaprogram;
/**
 * Write a program for a calculator with addition, subtraction,
 * multiplication and division methods all with parameters
 * and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */


import java.util.Scanner;

public class Program5 {

    public void addition(int a,int b){

        System.out.println("Addition of" + a + "and" + b + "is: " + (a+b));
    }
    public void subtraction(int a,int b){
        System.out.println("Subtraction of" + a + "and" + b + "is: " + (b-a));

    }
    public static void multiplication(int a,int b){
        System.out.println("Multiplication of" + a + "and" + b + "is: " + (a*b));
    }
    public static void division(int a,int b){
        System.out.println("Division of" + a + "and" + b + "is: " + (a/b));


    }

    public static void main(String[] args) {
        Program5 obj = new Program5();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = scanner.nextInt();
        System.out.println("Enter Second Number");
        int b = scanner.nextInt();
        obj.addition(a,b);
        obj.subtraction(b,a);
        multiplication(a,b);
        division(a,b);
        scanner.close();

    }
}


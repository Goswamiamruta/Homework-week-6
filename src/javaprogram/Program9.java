package javaprogram;

import java.util.Scanner;

/** Write a program to convert the upper case to lower case
 * */


public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create Scanner object
        System.out.println("Enter a upper case:"); // Enter a string in uppercase
        String uppercase = scanner.nextLine();
        scanner.close();                              // close the scanner
        String Lowercase = uppercase.toLowerCase(); // convert the string to lowercase
        System.out.println("Enter the String in Lowercase: " + Lowercase );

    }
}

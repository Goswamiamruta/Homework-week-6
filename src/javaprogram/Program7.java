package javaprogram;
/**

Write program to insert any temperature value in degree Fahrenheit and convert to degree Celsius

 */
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create a Scanner object for user input
        System.out.println("Enter temperature in Fahrenheit:"); // user to enter temperature in fahrenheit
        float fahrenheit = scanner.nextFloat();
        System.out.println("Enter convert to degree Celsius:"); // user to enter  convert to degree Celsius
        float celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit +"Fahrenheit is equal to" + celsius + "Celsius");
        scanner.close();


    }
}

package javaprogram;
/** Write to convert a decimal number to binary number
*/
import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimalNumber = scanner.nextInt();
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary Number:"+ binaryNumber);
        scanner.close();

    }
}

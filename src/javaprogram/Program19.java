package javaprogram;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 */
public class Program19 {
    public static void main(String[] args) {
    String name = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
    System.out.println("before converting to lower case"+ name);
    name = name .toLowerCase();
    System.out.println("After converting to lower case"+ name);
    System.out.println(name);
    }
}

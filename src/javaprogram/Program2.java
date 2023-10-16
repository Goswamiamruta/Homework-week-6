package javaprogram;
/**
 *  Static variable
 * Scope - within the class
 * when class is loaded
 * memory - heap
 */
public class Program2 {
    static int rollNo = 10;     //Static key word
    static String name= "Alexa";  // Static name

    public static void details(){
        System.out.println(rollNo);
        System.out.println(name);

    }

    public static void main(String[] args) {
        details();
    }

}

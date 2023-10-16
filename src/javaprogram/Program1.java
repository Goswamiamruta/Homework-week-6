package javaprogram;
/**
 * Declare two instance variables.
 * Declare one instance method.
 * Call both instance variables into the instance method inside the print statement.
 * Declare the Main method.
 * Call the above instance method into the Main method and Run the programme.

 */

public class Program1 {
        int rollNo = 10;        // Instance Variable
        String name = "Alexa"; // Instance word

public void details(){

       Program1 p1 = new Program1();
        System.out.println(p1.rollNo);
        System.out.println(p1.name);

}

        public static void main(String[] args) {
        Program1 obj =new Program1();
        obj.details();

        }





}


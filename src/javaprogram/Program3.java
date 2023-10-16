package javaprogram;
/**
 * Declare one instance and one static variable.
 * Declare one instance method.
 * Declare one static method.
 * Call both instance and static variables into both instance and static methods inside the print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme.
 */
public class Program3 {
    int rollNo = 10; // create instance
    static String name = "Alexa"; //create static variable
    public void details(){
        //create instance Method
        Program3 obj = new Program3();
        System.out.println(obj.rollNo);
        System.out.println(name);
    }
public static void printDetails(){
        // create static method
    Program3 obj = new Program3();   // object created
    System.out.println(obj.rollNo);
    System.out.println(name);
}

    public static void main(String[] args) {            // Main method
        Program3 obj = new Program3();
        obj.details();
        printDetails();
    }
}

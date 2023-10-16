package javaprogram;

/**
 *  Declare two instance and two static variables.
 *  Declare one instance method.
 *  Declare one static method.
 *  Call all four instance and static variables into both instance and static methods inside the print statement.
 *  Declare the Main method.
 *  Call both instance and static methods into the Main method and run the programme.
 *
 *
 *
 */
public class Program4 {
    int rollNo = 10;
    String firstName = "Aelexa";
    static int mobileNo = 10;
    static String lastName = "Patel";
    public void details(){
        Program4 obj =new Program4();
        System.out.println(obj.rollNo);
        System.out.println(obj.firstName);
        System.out.println(Program4.mobileNo);
        System.out.println(lastName);


    }
public static void printDetails(){
    Program4 obj =new Program4();
    System.out.println(obj.rollNo);
    System.out.println(obj.firstName);
    System.out.println(Program4.mobileNo);
    System.out.println(lastName);
}
    public static void main(String[] args) {
        Program4 obj = new Program4();
        obj.details();
        printDetails();
    }
}

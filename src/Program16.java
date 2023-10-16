import java.util.Scanner;
/**
input first binary Number:10
input second binary number :11
Expected output:
sum of two binary number : 101*/

public class Program16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first binary number:");
        String a = scanner.next();
        System.out.println("Input second binary number:");
        String b = scanner.next();

        // converting binary number in to integer
        int x = Integer.parseInt(a,2);
        int y = Integer.parseInt(b,2);
        int z = x+y;
        // converting integer addition in to binary
        System.out.println("x:"+ Integer.toBinaryString(x));
        System.out.println("y:"+ Integer.toBinaryString(y));
        System.out.println("z=x+y:"+ Integer.toBinaryString(z));
        scanner.close();




    }
}

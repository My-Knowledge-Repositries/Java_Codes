package Assignment4;

import java.util.Scanner;

public class FindAbs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int abs = scan.nextInt();
        int result = Math.abs(abs);
        System.out.println("Absolute Num is: "+result);
    }
}
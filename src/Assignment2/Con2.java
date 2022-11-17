package Assignment2;

import java.util.Scanner;

public class Con2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Grams:");
        int Grams = scan.nextInt();
        double Ounce = Grams * 0.035273962;
        System.out.println("Ounce:" + Ounce);
    }
}

package Assignment2;

import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your age : ");
        int age = input.nextInt();
        System.out.println("Your current age is : " + age);
        age+=10;
        System.out.println("Your age after 10 years is : " + age);
    }
}

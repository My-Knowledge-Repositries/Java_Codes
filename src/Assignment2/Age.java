package Assignment2;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Assignment2.Age:");
        int age = s.nextInt();
        age = age * 3;
        System.out.println("New Assignment2.Age is..: "+age);
    }
}

package Assignment4;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Num 1:");
        int num1 = scanner.nextInt();
        System.out.print("Enter Num 2:");
        int num2 = scanner.nextInt();
        System.out.print("Enter Num 3:");
        int num3 = scanner.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Maximum number is :" +num1);
        }else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Maximum number is :" +num2);
        }else {
            System.out.println("Maximum number is :" +num3);
        }
    }
}

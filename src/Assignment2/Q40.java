package Assignment2;

import java.util.Scanner;
public class Q40 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input number 1 : ");
        int num1=input.nextInt();
        System.out.print("Input number 2 : ");
        int num2=input.nextInt();
        System.out.println(num1+" "+num2);
        num1 = num1 + num2;
        num2 = num1 - num1;
        num1 = num1 - num2;
        System.out.println(num1+" "+num2);

    }
}

package Assignment2;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input name:- ");
        String s1 = scan.next();
        System.out.print("Input Address:- ");
        String s2 = scan.next();
        System.out.print(s1 + "\n" + s2);
    }
}

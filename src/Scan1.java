import java.util.Scanner;

public class Scan1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Num 1:- ");
        int i1 = s.nextInt();
        System.out.print("Enter Num 2:- ");
        int i2 = s.nextInt();
        int total = i1 + i2;
        System.out.println("Total is:" + total);
    }
}

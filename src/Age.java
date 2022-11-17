import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Age:");
        int age = s.nextInt();
        age = age * 3;
        System.out.println("New Age is..: "+age);
    }
}

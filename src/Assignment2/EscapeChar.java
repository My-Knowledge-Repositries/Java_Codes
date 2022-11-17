package Assignment2;

public class EscapeChar {
    public static void main(String[] args) {
        System.out.println("Java is a typed language"); //A
        System.out.println("AB\"CB"); //B
        System.out.println("AB\\CD"); //C
        System.out.println("C:\\Windows\\Program"); //D
        System.out.println("AB\\\"CD"); //E
        System.out.println("AB\\\\\"\"CD"); //F
        System.out.println("AB\\nCD"); //G
        System.out.println("AB\\tCD"); //H
        System.out.println("AB\\bCD"); //I
    }
}

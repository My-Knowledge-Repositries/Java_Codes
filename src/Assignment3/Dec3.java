package Assignment3;

public class Dec3 {
    public static void main(String[] args) {
        double d = 'A';
        long l = (int) d; //legal 1

        /*char ch=’A’;
        double d=ch;*/ //illegal

        /*byte b=’65’;
        char ch=b;*/ //illegal

       /* double d =’A’
        char ch = (short) d;*/ //illegal

        float f=65;
        int x=(char)f; //legal 5


    }
}

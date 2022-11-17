package Assignment3;

public class Que10 {
    public static void main(String[] args) {
        int tot = 971;
        double avg;
        avg = (double) tot/10; //legal
        avg = tot/(double)10; //legal
        avg = (double)(tot/10); //legal, wrong answer
        avg = tot/10; //legal, wrong answer
        System.out.println("Average :" + avg);

    }
}

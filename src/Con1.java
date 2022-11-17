    public class Con1 {
        public static void main(String[] args) {
            inchToMill(2);
        }
        public static double inchToMill(int inches) {
            double m;
            m = inches * 25.4;
            System.out.printf("Value of 8 inches in millimeter is: %.2f \n", +m);
            return 0;
        }
    }
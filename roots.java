
import java.util.Scanner;

public class roots {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (;;) {
            System.out.println("input int:");
            int i = s.nextInt(); 
            System.out.println("sqrt "+i+" = "+squareRoot(i));
        }
    }

    public static double squareRoot(double a) {
        double xi = a / 2;
        double xn = a;
        while (xn - xi > 0.0001) {
            xn = (xi + a / xi) / 2.0;
            xi = (xn + a / xn) / 2.0;

        }
        return xi;
    }
}
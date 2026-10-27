import java.util.Scanner;
public class Doubloon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (;;) {
            System.out.print("Input a word:");
            String s = scn.nextLine();
            System.out.println(isDoubloon(s));
        }
    }

    public static boolean isDoubloon(String s) {
        for (int a = 0; a < s.length(); a++) {
            int count = 0;
            for (int b = 0; b < s.length(); b++) {
                if (s.charAt(a) == b)
                    count++;
            }
            if (count != 2) {
                System.out.println(count);
                return false;
            }
        }
        return true;
    }
}

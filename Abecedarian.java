import java.util.Scanner;
public class Abecedarian {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (;;) {
            System.out.print("Input a word:");
            String s = scn.nextLine();
            System.out.println(isAbecedarian(s));
        }
    }

    public static boolean isAbecedarian(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1) || s.charAt(i) == s.charAt(i+1))
                return false;
        }
        return true;
    }
}

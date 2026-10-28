import java.util.Scanner;
public class Scrabble {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (;;) {
			System.out.print("Input set of letters:");
            String a = s.nextLine();
            System.out.print("Input word:");
            String b = s.nextLine();
            if(canSpell(a,b)) {
				System.out.println(b + " can be spelt with " + a);
			} else System.out.println(b + " cannot be spelt with " + a);
        }
    }

    public static boolean canSpell(String a, String b) {
        for (int i = 0; i < b.length(); i++) {
            if (a.indexOf(b.charAt(i)) == -1) return false;
            if (countChars(b, b.charAt(i)) > countChars(a, b.charAt(i))) return false;
        }
        return true;
    }
    
    public static int countChars(String s, char c) {
		int count = 0;
		for (int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) == c) count++;
		}
		return count;
	}
}

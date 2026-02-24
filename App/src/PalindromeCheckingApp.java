
public class PalindromeCheckingApp {
    public static boolean BruteForce(String s){

        // Convert to lowercase for case-insensitive check
        s = s.toLowerCase();

        // Reverse the string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        // Compare original and reversed
        return s.equals(rev);
    }

    public static boolean Pointer(String s){

        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean Recursive(String s, int i, int j) {

        if (i >= j) return true;

        if (s.charAt(i) != s.charAt(j)) return false;

        return Recursive(s, i + 1, j - 1);
    }

    public static void main(String[] args) {

        String s = "level";

        if (BruteForce(s)) {
            System.out.println("\"" + s + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome.");
        }

        String s1 = "geeks";
        String s2 = "Racecar";

        System.out.println("\"" + s1 + "\" palindrome? " + Pointer(s1));
        System.out.println("\"" + s2 + "\" palindrome? " + Pointer(s2));

        String s = "Racecar";
        s = s.toLowerCase();

        System.out.println(Recursive(s, 0, s.length() - 1));
    }
}


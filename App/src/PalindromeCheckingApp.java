
public class PalindromeCheckingApp {
    public class GFG{

        public static boolean isPalindrome(String s){

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

        public static void main(String[] args) {

            String s = "level";

            if (isPalindrome(s)) {
                System.out.println("\"" + s + "\" is a palindrome.");
            } else {
                System.out.println("\"" + s + "\" is not a palindrome.");
            }
        }
    }
}


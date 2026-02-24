import java.util.*;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckingApp {
    /**
     * Checks if a given string is a palindrome using a Deque.
     * Non-alphanumeric characters and case are ignored.
     *
     * @param str The string to check.
     * @return true if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        Deque<Character> charDeque = new ArrayDeque<>();

        // Preprocess the string: convert to lowercase and add only letters/digits to the deque
        String cleanStr = str.toLowerCase();
        for (char c : cleanStr.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charDeque.addLast(c);
            }
        }

        // Compare characters from both ends
        while (charDeque.size() > 1) {
            Character first = charDeque.removeFirst(); // Remove from the front (head)
            Character last = charDeque.removeLast();   // Remove from the back (tail)

            if (!first.equals(last)) {
                return false; // Not a palindrome if any pair does not match
            }
        }

        return true; // The string is a palindrome
    }

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "A man, a plan, a canal, Panama";
        String s3 = "hello";

        System.out.println("Is \"" + s1 + "\" a palindrome? " + isPalindrome(s1));
        System.out.println("Is \"" + s2 + "\" a palindrome? " + isPalindrome(s2));
        System.out.println("Is \"" + s3 + "\" a palindrome? " + isPalindrome(s3));
    }
}


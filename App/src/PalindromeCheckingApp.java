import java.util.*;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckingApp {
    public static boolean isPalindrome(String input) {
        // Normalize the input: convert to lowercase and remove non-alphanumeric characters
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add each character to both the queue and the stack
        for (char c : cleanedInput.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Compare characters from the front of the queue and the top of the stack
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                // If any characters do not match, it's not a palindrome
                return false;
            }
        }

        // If the loop completes without any mismatch, it is a palindrome
        return true;
    }

    public static void main(String[] args) {
        String testString1 = "madam";
        String testString2 = "A man, a plan, a canal, Panama."; // Palindrome phrase
        String testString3 = "hello";

        System.out.println("Is \"" + testString1 + "\" a palindrome? " + isPalindrome(testString1));
        System.out.println("Is \"" + testString2 + "\" a palindrome? " + isPalindrome(testString2));
        System.out.println("Is \"" + testString3 + "\" a palindrome? " + isPalindrome(testString3));
    }
}


import java.util.*;
import java.util.Stack;
public class PalindromeCheckingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String inputString = in.nextLine();

        // Optional: Normalize the string (ignore case and non-alphanumeric characters)
        String normalizedString = inputString.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters of the normalized string onto the stack
        for (int i = 0; i < normalizedString.length(); i++) {
            stack.push(normalizedString.charAt(i));
        }

        String reverseString = "";
        // Pop each character from the stack to build the reversed string
        while (!stack.isEmpty()) {
            reverseString += stack.pop();
        }

        // Compare the original normalized string with the reversed string
        if (normalizedString.equals(reverseString)) {
            System.out.println("The input String is a palindrome.");
        } else {
            System.out.println("The input String is not a palindrome.");
        }
    }
    }


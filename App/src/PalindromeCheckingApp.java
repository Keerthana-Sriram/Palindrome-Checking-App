
public class PalindromeCheckingApp {
    /**
     * Public method to check if a string is a palindrome.
     * It uses a private helper method for the actual recursion.
     * @param str The string to check.
     * @return true if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        // Optional: Preprocess the string to handle case-insensitivity and non-alphanumeric characters.
        // For a simple, strict string comparison, skip this.
        // String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // return isPalindromeRecursive(cleanStr, 0, cleanStr.length() - 1);

        return isPalindromeRecursive(str, 0, str.length() - 1);
    }

    /**
     * Private recursive helper method to check the palindrome property.
     * @param str The string being checked.
     * @param left The index of the left pointer (start).
     * @param right The index of the right pointer (end).
     * @return true if the substring is a palindrome, false otherwise.
     */
    private static boolean isPalindromeRecursive(String str, int left, int right) {
        // Base case 1: If the left pointer crosses or meets the right pointer,
        // it means all characters have been compared and matched, so it is a palindrome.
        if (left >= right) {
            return true;
        }

        // Base case 2: If the characters at the current left and right positions
        // do not match, it is not a palindrome.
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive case: If the current characters match,
        // recursively call the function for the inner substring
        // by moving the pointers inward.
        return isPalindromeRecursive(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "racecar";
        String s3 = "hello";

        System.out.println(s1 + " is a palindrome? " + isPalindrome(s1));
        System.out.println(s2 + " is a palindrome? " + isPalindrome(s2));
        System.out.println(s3 + " is a palindrome? " + isPalindrome(s3));
    }
}


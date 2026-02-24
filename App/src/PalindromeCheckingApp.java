
public class PalindromeCheckingApp {
    public static boolean isPalindromeIgnoreCaseAndSpaces(String originalString) {
        // Remove all non-alphanumeric characters (including spaces and punctuation)
        // and convert to lowercase
        String cleanString = originalString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string using StringBuilder
        String reverseString = new StringBuilder(cleanString).reverse().toString();

        // Compare the cleaned string with its reversed version
        return cleanString.equals(reverseString);
    }

    public static void main(String[] args) {
        String testPhrase = "A man, a plan, a canal, Panama";
        System.out.println("The phrase: \"" + testPhrase + "\" is a palindrome? " +
                isPalindromeIgnoreCaseAndSpaces(testPhrase));

        String testPhrase2 = "Race car";
        System.out.println("The phrase: \"" + testPhrase2 + "\" is a palindrome? " +
                isPalindromeIgnoreCaseAndSpaces(testPhrase2));

        String testPhrase3 = "hello world";
        System.out.println("The phrase: \"" + testPhrase3 + "\" is a palindrome? " +
                isPalindromeIgnoreCaseAndSpaces(testPhrase3));
    }
}


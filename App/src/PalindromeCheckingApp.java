
public class PalindromeCheckingApp {
    // Data Hiding: Private variable
    private String text;

    // Constructor
    public PalindromeManager(String text) {
        this.text = text;
    }

    // Setter to allow changing the text
    public void setText(String text) {
        this.text = text;
    }

    // Public method that provides access to the functionality
    public boolean isPalindrome() {
        if (text == null) return false;

        // Encapsulated logic: Using StringBuilder for reversal
        String reversed = new StringBuilder(text).reverse().toString();

        // Return result of comparison
        return text.equals(reversed);
    }
}


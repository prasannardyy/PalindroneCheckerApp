// File: UseCase2PalindromeCheckerApp.java

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {
        // Hardcoded input string
        String word = "madam";

        // Check if the string is a palindrome
        boolean result = isPalindrome(word);

        // Print output in the requested format
        System.out.println("input text : " + word);
        System.out.println("it is a palindrome?: " + result);
    }

    // Method to check palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }
}

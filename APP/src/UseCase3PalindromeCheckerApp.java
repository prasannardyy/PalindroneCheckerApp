// File: UseCase3PalindromeCheckerApp.java

import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker (Using String Reverse) ===");
        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();

        // Step 1: Reverse the string using a loop
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); // String concatenation
        }

        // Step 2: Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}

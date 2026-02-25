public class PalindroneCheckerApp {
    public static void main(String[] args){


        // Declare and initialize input
        String input = "noon";

        // Assume it is a palindrome
        boolean isPalindrome = true;

        // Two-pointer approach using String.charAt()
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}


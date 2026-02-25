/*
 * UseCase1: Application Entry & Welcome Message
 * Palindrome Checker Application
 */

public class PalindromeCheckerApp {
    /*
     * UseCase4: Character Array Based Palindrome Check
     */

        public static void main(String[] args) {

            // Original String
            String input = "level";

            // Convert string to character array
            char[] characters = input.toCharArray();

            // Two-pointer approach
            int start = 0;
            int end = characters.length - 1;

            boolean isPalindrome = true;

            while (start < end) {

                if (characters[start] != characters[end]) {
                    isPalindrome = false;
                    break;
                }

                start++;
                end--;
            }

            // Display result
            if (isPalindrome) {
                System.out.println("The string \"" + input + "\" is a Palindrome.");
            } else {
                System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
            }

            System.out.println("Program completed successfully.");
        }
}
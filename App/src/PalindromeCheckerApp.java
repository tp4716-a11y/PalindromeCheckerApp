/*
 * UseCase1: Application Entry & Welcome Message
 * Palindrome Checker Application
 */

public class PalindromeCheckerApp {

    /*
     * UseCase2: Print a Hardcoded Palindrome Result
     */


        public static void main(String[] args) {

            // Hardcoded string (String Literal)
            String word = "madam";

            // Reverse the string
            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }

            // Check if palindrome using conditional statement
            if (word.equals(reversed)) {
                System.out.println("The word \"" + word + "\" is a Palindrome.");
            } else {
                System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
            }

            System.out.println("Program executed successfully.");
        }
}
/*
 * UseCase1: Application Entry & Welcome Message
 * Palindrome Checker Application
 */

public class PalindromeCheckerApp {

    /*
     * UseCase3: Palindrome Check Using String Reverse
     */


        public static void main(String[] args) {

            // Original String
            String original = "racecar";

            // Variable to store reversed string
            String reversed = "";

            // Loop to reverse the string
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i);
            }

            // Compare original and reversed using equals()
            if (original.equals(reversed)) {
                System.out.println("The string \"" + original + "\" is a Palindrome.");
            } else {
                System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
            }

            System.out.println("Program completed.");
        }
}
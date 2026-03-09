import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        PalindromeCheckerApp obj = new PalindromeCheckerApp();
        boolean result = obj.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    /**
     * Checks whether a string is palindrome
     * @param input input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
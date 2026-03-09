import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "refer";

        // Create a Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        // Flag to track palindrome
        boolean isPalindrome = true;

        // Compare first and last characters
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

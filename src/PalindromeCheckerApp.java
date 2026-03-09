import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "noon";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare with popped characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

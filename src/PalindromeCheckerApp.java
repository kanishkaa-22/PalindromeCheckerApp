import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "level";

        // Create LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to the list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag for palindrome
        boolean isPalindrome = true;

        // Compare first and last characters
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

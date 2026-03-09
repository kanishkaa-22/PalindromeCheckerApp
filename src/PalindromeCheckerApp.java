import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        PalindromeCheckerApp obj = new PalindromeCheckerApp();
        boolean result = obj.check(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    /**
     * Checks whether a string is palindrome using stack
     * @param input input string
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters with stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
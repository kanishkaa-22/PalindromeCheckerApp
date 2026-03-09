public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Pointer at beginning
        int start = 0;

        // Pointer at end
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters until pointers meet
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Two-pointer approach
    public static boolean checkUsingTwoPointer(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack approach
    public static boolean checkUsingStack(String word) {
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }

    public static void main(String[] args) {

        String input = "madam";

        // Measure time for Two Pointer
        long start1 = System.nanoTime();
        boolean result1 = checkUsingTwoPointer(input);
        long end1 = System.nanoTime();

        // Measure time for Stack
        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        long end2 = System.nanoTime();

        System.out.println("Input: " + input);

        System.out.println("\nTwo Pointer Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\nStack Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");
    }
}
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

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
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Deque<Character> deque = new LinkedList<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new DequeStrategy();

        boolean result = strategy.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}
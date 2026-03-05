public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Convert string to character array
        char[] arr = word.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }
    }
}
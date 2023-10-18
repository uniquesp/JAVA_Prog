import java.util.Scanner;

public class PalindromeWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split(" ");
        int count = 0;

        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }

        System.out.println("Palindrome words count: " + count);
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

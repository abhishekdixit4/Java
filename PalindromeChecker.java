public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
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

    public static void main(String[] args) {
        String[] testStrings = {"radar", "hello", "level", "world", "civic"};

        for (String s : testStrings) {
            System.out.printf("\"%s\" is palindrome: %b%n", s, isPalindrome(s));
        }
    }
}


import java.util.Scanner;

class Five {
    // This method checks if a given number is a palindrome.
    public static boolean isPalindrome(int x) {
        int copy;
        if (x <= 0)
            return false;
        copy = reverseValue(x, 0);
        return copy == x;
    }

    // This method reverses the given number using recursion.
    public static int reverseValue(int x, int y) {
        // Base case: When there are no more digits to reverse
        if (x == 0)
            return y;
        int lastDigit = x % 10;
        return reverseValue(x / 10, y * 10 + lastDigit);
    }

    public static void main(String[] args) {
        System.out.println("Please Enter A number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("The Given number is a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
}

import java.util.Scanner;

class Twelve {
    public static void main(String[] args) {
        String reversed = ""; // Initialize an empty string to store the reversed string

        // Prompt the user to enter a string
        System.out.print("Enter A String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // Read the input string from the user
        System.out.println("Input String: " + str);

        // Reverse the input string using a loop
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append each character in reverse order to the 'reversed' string
        }

        // Check if the input string is a palindrome by comparing it with its reverse
        if (str.equals(reversed)) {
            System.out.println("The Given String is Palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }
}

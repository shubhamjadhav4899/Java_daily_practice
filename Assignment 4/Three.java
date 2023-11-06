import java.util.Scanner;

class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        int numberCp = number; // Create a copy of the number

        // Prompt the user to enter the power
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = number; // Initialize the result with the original number

        // Calculate the power using a loop
        for (int i = 1; i < power; i++) {
            result = result * number; // Multiply the result by the original number
        }

        // Display the result
        System.out.println(numberCp + " raised to the power of " + power + " = " + result);
    }
}

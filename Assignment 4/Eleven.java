class Eleven {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int f = facorialByRange(i);
            System.out.println("The factorial of " + i + " is " + f);
        }
    }

    public static int facorialByRange(int x) {
        int result = 1; // Initialize the result to 1

        // Calculate the factorial for the given range (x)
        for (int i = 1; i <= x; i++) {
            result *= i; // Multiply the result by the current value of i
        }

        return result; // Return the calculated factorial for the range (x)
    }
}

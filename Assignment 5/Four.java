 class Four {
    /**
     * The main method is the entry point of the program.
     * It iterates through numbers from 1 to 10, calculates their factorial, and prints the result.
     *
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int factorial = getFactorial(i);
            System.out.println("Factorial of " + i + " is " + factorial);
        }
    }

    /**
     * This method calculates the factorial of a given integer.
     *
     * @param x The input integer for which the factorial is calculated.
     * @return The factorial of the input integer.
     */
    public static int getFactorial(int x) {
        int copy = x;
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}

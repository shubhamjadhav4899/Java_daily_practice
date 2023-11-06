class One {
    public static void main(String[] args) {
        int res = 0; // Initialize a variable to store the sum of cubes

        // Calculate the sum of cubes for numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            res += cube(i); // Add the cube of the current number to the result
        }

        // Display the sum of cubes for the range 1 to 10
        System.out.println("The Sum of Cube between 1 to 10 is: " + res);
    }

    // This method calculates the cube of a given number (x)
    public static int cube(int x) {
        int copyOfx = x; // Create a copy of the original number
        int res = 1;

        // Calculate the cube by multiplying the number by itself three times
        for (int i = 1; i < 3; i++) {
            res = x * copyOfx; // Multiply the current result by the original number
            copyOfx = res; // Update the copy of the number for the next iteration
        }

        return res; // Return the calculated cube
    }
}

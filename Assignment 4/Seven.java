class Seven{
	 public static void main(String[] args) {
        // Define an integer array with elements.
        int[] arr = {10, 20, 30};

        // Initialize a variable to store the sum of the array elements.
        int sum = 0;

        // Iterate through the array and calculate the sum of its elements.
        for (int i:arr) {
            sum += i;
        }

        // Calculate the average by dividing the sum by the number of elements.
        int avg = sum / arr.length;

        // Print the calculated average to the console.
        System.out.println("The average is : " + avg);
    }
}
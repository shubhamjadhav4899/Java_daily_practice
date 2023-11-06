public class Eight {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int originalValue=n;
        int sum = 0; // Initialize the sum of factorials

        while (n != 0) {
            int number = n % 10;
            int factorial = 1; // Initialize the factorial for the current digit

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            sum += factorial; // Add the factorial of the current digit to the sum
            n = n / 10;
        }

        if(sum==o){
        	System.out.println("The Number is Strong Number.");
        }
        else{
        	System.out.println("The Number is Not Strong Number.");
        }
    }
}

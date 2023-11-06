 class Two {
    public static void main(String[] args) {
        int sum = sumOfPrime();
        System.out.println("The sum of prime numbers between 1 and 100 is: " + sum);
    }

    // Calculates the sum of prime numbers between 1 and 100
    public static int sumOfPrime() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i))
                sum += i;
        }
        return sum;
    }

    // Checks if a number is prime
    public static boolean isPrime(int x) {
        int n = x;
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}

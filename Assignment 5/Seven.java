import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter A Number: ");
        int n = sc.nextInt();
        int singleDigitSum = findSingleDigitSum(n);
        System.out.println("The sum of the digits until a single digit is: " + singleDigitSum);
    }

    public static int findSingleDigitSum(int x) {
        while (x >= 10) {
            int sum = 0;
            while (x > 0) {
                int digit = x % 10;
                sum += digit;
                x /= 10;
            }
            x = sum;
        }
        return x;
    }
}

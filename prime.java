import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the Scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a positive integer: ");

            // Check if input is an integer
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid positive integer.");
                return;
            }

            int num = sc.nextInt();

            // Handle edge cases for non-prime numbers
            if (num <= 1) {
                System.out.println(num + " is not a prime number.");
                return;
            }

            // Optimized prime-checking logic
            boolean isPrime = true;

            // Check divisors up to the square root of the number
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Output result
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

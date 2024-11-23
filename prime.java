import java.util.Scanner;

public class Prime {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= num / 2; i++) { // Check divisibility from 2 to num/2
            if (num % i == 0) { // If divisible, it's not prime
                return false;
            }
        }
        return true; // It's a prime number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        // Check if the number is prime and print the result
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        sc.close(); // Close the Scanner to avoid memory leak
    }
}

            

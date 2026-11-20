package factorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Prints out the factorial of any non-negative integer.
 */
public class Factorial {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a non-negative integer: ");
            int number = input.nextInt();
            while (number < 0) {
                System.out.println("Your input must be non-negative. Please enter a positive number: ");
                number = input.nextInt();
            }
            if (number <= 20) {
                System.out.println("The factorial of " + number + " will yield: " + factorial(number));
            } else {
                System.out.println("The factorial of " + number + " will yield: " + factorialBig(number));
            }
        } catch (Exception e) {
            System.out.println("Error: You did not enter a valid integer. Program has terminated.");
        }
    }

    /**
     * Computes factorial for n in [0, 20] without silent long overflow.
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n > 20) {
            throw new IllegalArgumentException("n > 20 overflows long; use factorialBig(n)");
        }
        long result = 1L;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Arbitrary-precision factorial for any non-negative integer.
     */
    public static BigInteger factorialBig(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

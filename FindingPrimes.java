import java.util.ArrayList;
import java.util.List;

/**
 * The Sieve of Eratosthenes algorithm to find all prime numbers below a given limit.
 */
public class FindingPrimes {

    public static void main(String[] args) {
        SOE(20);
    }

    /**
     * Returns all primes strictly less than n using the Sieve of Eratosthenes.
     *
     * @param n Upper bound (exclusive)
     * @return List of primes in [2, n)
     */
    public static List<Integer> findPrimesUpTo(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n <= 2) {
            return primes;
        }

        boolean[] sieve = new boolean[n];
        for (int i = 2; i < n; i++) {
            sieve[i] = true;
        }

        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (sieve[i]) {
                for (int j = i * i; j < n; j += i) {
                    sieve[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (sieve[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    /**
     * Prints all prime numbers strictly less than n.
     *
     * @param n Upper bound (exclusive)
     */
    public static void SOE(int n) {
        List<Integer> primes = findPrimesUpTo(n);
        for (int p : primes) {
            System.out.print(p + " ");
        }
    }
}

/*
 * Useful helper functions that are reused.
 *
 * Recommended to statically import this class where necessary.
 */
public class Helpers {

    /*
     * Run the Sieve of Eratosthenes on all numbers up to n
     *
     * Returns an array with true values for each prime
     */
    public static boolean[] sieve(int n) {
        boolean[] b = new boolean[n + 1];

        // initially assume all numbers are prime
        for (int i = 2; i < b.length; i++) {
            b[i] = true;
        }

        for (int j = 2; j * j <= n; j++) {
            if (b[j]) {
                for (int k = 2; j * k <= n; k++) {
                    b[k * j] = false;
                }
            }
        }

        return b;
    }

    /*
     * List all primes up to n
     */
    public static int[] listPrimes(int n) {
        int countPrimes = 0;
        boolean[] sieve = sieve(n);

        for (int i = 0; i < sieve.length; i++) {
            if (sieve[i]) {
                countPrimes++;
            }
        }

        int[] primes = new int[countPrimes];

        for (int i = 0, k = 2; k < sieve.length; k++) {
            if (sieve[k]) {
                primes[i] = k;
                i++;
            }
        }

        return primes;
    }

    /*
     * Bruteforce method to check if a number is prime (iteratively check if a number has any factors)
     */
    public static boolean isPrime(long n) {
        long end = (long) Math.ceil(Math.sqrt(n));

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= end; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /*
     * Find the smallest factor of some number n
     */
    public static long findSmallestFactor(long n) {
        long max = (long) Math.ceil(Math.sqrt(n));

        for (long i = 2; i <= max; i++) {
            if (n % i == 0) {
                return i;
            }
        }

        return n; // n itself is the only factor
    }
}

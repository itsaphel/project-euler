/*
 * Useful helper functions that are reused.
 *
 * Recommended to statically import this class where necessary.
 */
public class Helpers {

    public static boolean bruteforceIsPrime(long n) {
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

    public static long findSmallestFactor(Long n) {
        long max = (long) Math.ceil(Math.sqrt(n));

        for (long i = 2; i <= max; i++) {
            if (n % i == 0) {
                return i;
            }
        }

        return n; // n itself is the only factor
    }
}

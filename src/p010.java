import java.math.BigInteger;

public class p010 implements Solution {
    public static void main(String[] args) {
        System.out.println(new p010().run());
    }

    public String run() {
        int n = 2000000;
        BigInteger sum = BigInteger.ZERO;

        int[] primes = Helpers.listPrimes(n);
        for (int i : primes) {
            sum = sum.add(BigInteger.valueOf(i));
        }

        return sum.toString();
    }
}

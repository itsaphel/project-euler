import java.math.BigInteger;

public class p006 implements Solution {
    public static void main(String[] args) {
        System.out.println(new p006().run());
    }

    /*
     * Using formulae for the sum of r and sum of r^2 we can use a more efficient method of calculating this that will remain efficient for large
     * values of n.
     */
    public String run() {
        double n = 100;

        // sum of r: n/2(n+1)
        double sumSquared = (1/2.0) * n * (n + 1);
        sumSquared = sumSquared * sumSquared;
        // sum of r^2: n/6(n+1)(2n+1)
        double sumOfSquares = (1/6.0) * n * (n + 1) * (2 * n + 1);

        return String.format("%.0f", Math.abs(sumSquared - sumOfSquares));
    }

    /*
     * Less efficient solution:
     *
     * Since 100 isn't a very large number we can compute this very quickly (<1s on my Mac). This will, however, cripple for larger values of n.
     */
    public String run_1() {
        BigInteger sumOfSquares = BigInteger.ZERO;
        BigInteger sumSquared = BigInteger.ZERO;

        for (int i = 1; i <= 100; i++) {
            BigInteger bigI = BigInteger.valueOf(i);
            sumOfSquares = sumOfSquares.add(bigI.multiply(bigI));
            sumSquared = sumSquared.add(bigI);
        }

        sumSquared = sumSquared.multiply(sumSquared);

        return sumOfSquares.subtract(sumSquared).abs().toString();
    }
}

import java.math.BigInteger;

public class p006 implements Solution {
    public static void main(String[] args) {
        System.out.println(new p006().run());
    }

    public String run() {
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

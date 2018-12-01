import java.math.BigInteger;

public class p010 implements Solution {
    public static void main(String[] args) {
        System.out.println(new p010().run());
    }

    public String run() {
        long n = 2000000;
        BigInteger sum = BigInteger.ZERO;

        for (long i = 2; i < n; i++) {
            if (Helpers.bruteforceIsPrime(i)) {
                sum = sum.add(BigInteger.valueOf(i));
            }
        }

        return sum.toString();
    }
}

import java.math.BigInteger;

public class p005 implements Solution {
    public static void main(String[] args) {
        System.out.println(new p005().run());
    }

    public String run() {
        BigInteger previous = BigInteger.ONE;
        for (int i = 2; i <= 20; i++) {
            BigInteger bigI = BigInteger.valueOf(i);
            previous = previous.multiply(bigI)
                    .divide(previous.gcd(bigI));
        }

        return previous.toString();
    }
}

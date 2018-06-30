public class p012 implements Solution {
    public static void main(String[] args) {
        System.out.println(new p012().run());
    }

    @Override
    public String run() {
        int n = 500;

        for (int i = 1; ; i++) {
            int count = getDivisorCount(getTriangleSum(i));
            if (count > n) {
                return String.valueOf(getTriangleSum(i));
            }
        }
    }

    private int getDivisorCount(int n) {
        int divisors = 0;
        int sqrt = (int) Math.floor(Math.sqrt(n));

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                divisors++;
            }
        }
        divisors *= 2;

        if (n % (sqrt + 1) == 0) {
            divisors++;
        }

        return divisors;
    }

    private int getTriangleSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}

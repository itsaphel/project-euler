public class p007 implements Solution {
    public static void main(String[] args) {
        System.out.println(new p007().run());
    }

    public String run() {
        int n = 10001;

        for (int i = 2, count = 0; ; i++) {
            if (isPrime(i)) {
                count++;
            }

            if (count == n) {
                return String.valueOf(i);
            }
        }
    }

    private boolean isPrime(long n) {
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
}

public class p003 {
    public static void main(String[] args) {
        System.out.println(new p003().run());
    }

    public String run() {
        long n = 600851475143L;

        while (true) {
            long factor = findSmallestFactor(n);

            if (factor == n) {
                return String.valueOf(n);
            } else {
                n = n / factor;
            }
        }
    }

    private long findSmallestFactor(Long n) {
        long max = (long) Math.ceil(Math.sqrt(n));

        for (long i = 2; i <= max; i++) {
            if (n % i == 0) {
                return i;
            }
        }

        return n; // n itself is the only factor
    }
}

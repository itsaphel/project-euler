public class p003 {
    public static void main(String[] args) {
        System.out.println(new p003().run());
    }

    public String run() {
        long n = 600851475143L;

        while (true) {
            long factor = Helpers.findSmallestFactor(n);

            if (factor == n) {
                return String.valueOf(n);
            } else {
                n = n / factor;
            }
        }
    }
}

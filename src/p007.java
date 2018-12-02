public class p007 implements Solution {
    public static void main(String[] args) {
        System.out.println(new p007().run());
    }

    public String run() {
        int n = 10001;

        for (int i = 2, count = 0; ; i++) {
            if (Helpers.isPrime(i)) {
                count++;
            }

            if (count == n) {
                return String.valueOf(i);
            }
        }
    }
}

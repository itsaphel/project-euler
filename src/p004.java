public class p004 implements Solution {
    public static void main(String[] args) {
        System.out.println(new p004().run());
    }

    public String run() {
        int n = 0;

        for (int y = 100; y < 1000; y++) {
            for (int z = 100; z < 1000; z++) {
                int product = y * z;

                if (checkIfPalindrome(product)) {
                    if (product > n) {
                        n = product;
                    }
                }
            }
        }

        return String.valueOf(n);
    }

    private boolean checkIfPalindrome(int n) {
        String a = String.valueOf(n);
        String b = new StringBuilder().append(a).reverse().toString();

        return (a.equals(b));
    }
}

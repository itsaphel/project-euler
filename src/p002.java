public class p002 implements Solution {
    public static void main(String[] args) {
        System.out.println(new p002().run());
    }

    public String run() {
        int sum = 0;

        int one = 0;
        int two = 1;
        for (int current = 1; current < 4000000; current = one + two) {
            one = two;
            two = current;

            if (current % 2 == 0) {
                sum += current;
            }
        }

        return String.valueOf(sum);
    }
}

public class p009 implements Solution {

    public static void main(String[] args) {
        System.out.println(new p009().run());
    }

    public String run() {
        int a = 0;
        int b = 0;
        int c = 0;

        // a:
        for (int y = 0; y < 334; y++) {
            // b:
            for (int z = 0; z < 500; z++) {
                int cT = (1000 - y - z);
                if (z * z == cT * cT - y * y) {
                    a = y;
                    b = z;
                    c = cT;
                }
            }
        }

        return String.valueOf(a * b * c);
    }
}

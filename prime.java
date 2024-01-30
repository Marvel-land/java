public class prime {
    public static void main(String[] args) {
        int N = 45;
        int x;
        int y;
        for (x = 1; x <= N; x++) {
            if (x == 1 || x ==0)
                continue;
            boolean flg = true;
            for (y=2; y <= x/2; ++y) {
                if (x % y == 0) {
                    flg = false;
                    break;
                }
            }

            if (flg == true)
                System.out.print(x + " ");
        }
    }
}

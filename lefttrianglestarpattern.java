public class lefttrianglestarpattern {
    public static void main(String[] args) {
        int i, j;
        int N = 5;
        for (i = 0; i < N; i++) {
            for (j = 2*(N-i); j >= 0; j--)
                System.out.print(" ");
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

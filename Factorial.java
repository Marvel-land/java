public class Factorial {
    public static void main(String[] args) {
        int res = 1, i;
        int N = 5;
        for (i = 1; i <= N; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}

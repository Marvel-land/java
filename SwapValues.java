import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Value of m is " + m + "Values of n is " + n);
    }
}

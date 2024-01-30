import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = (a > b) ? a : b;

        while(true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans ++;
        }
        System.out.println(ans);
    }
}

import java.util.Scanner;
public class even_odd_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String ans = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(ans);
    }
}

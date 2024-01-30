import java.util.Scanner;

public class positive_negative_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("Positive Number");
        } else if (x < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Value is Zero");
        }
    }
}

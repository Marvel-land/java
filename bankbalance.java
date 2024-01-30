import java.util.Scanner;

public class bankbalance {
    public static void main(String[] args) {
        final double PENALTY = 8.00;
        final double INTEREST_RATE = 0.02;
        double balance;

        System.out.print("Enter your checking account balance: $");
        Scanner sc = new Scanner(System.in);
        balance = sc.nextDouble();
        System.out.println("Original balance $" + balance);

        if (balance >= 0)
            balance = balance + (INTEREST_RATE * balance)/12;
        else
            balance = balance - PENALTY;

        System.out.println(balance);
    }
}

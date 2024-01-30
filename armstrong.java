import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNumber = num;  // Store the original number
        int digits = 0;

        // Count the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            digits++;
        }

        originalNumber = num;  // Reset originalNumber to the input number
        int result = 0;

        // Calculate the sum of nth power of individual digits
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        // Check if the sum is equal to the original number
        if (result == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not An Armstrong Number");
        }
    }
}

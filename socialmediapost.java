import java.util.Scanner;

public class socialmediapost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int likes = sc.nextInt();
        int comments = sc.nextInt();
        int num = likes + (2*comments);
        if (num > 1000)
            System.out.println("Familiar");
        else
            System.out.println("Unfamiliar");
    }
}

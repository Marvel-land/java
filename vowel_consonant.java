import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a','e','i','o','u' -> {
                System.out.println("Vowel");
            }
            default -> System.out.println("Consonant");
        }
    }
}

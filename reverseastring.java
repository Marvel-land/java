import java.util.Scanner;

public class reverseastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reversedStr = "";
        String originalStr = sc.nextLine();

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println(reversedStr);
    }
}

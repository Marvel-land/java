import java.util.Scanner;

public class numofwordinastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        int countwords = words.split("\\s").length;
        System.out.println(countwords);
    }
}

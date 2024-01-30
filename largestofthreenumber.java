import java.util.Scanner;

public class largestofthreenumber {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if (x >= y && x >= z) {
            System.out.println(x);
        } else if (y >= x && y >= z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}

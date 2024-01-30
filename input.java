import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        byte b = sc.nextByte();
        long l = sc.nextLong();
        short s = sc.nextShort();

        String str = sc.next();  // hello world => hello
        String str2 = sc.nextLine(); // hello world => hello world
        boolean bool = sc.nextBoolean();
        char c = sc.next().charAt(0);
        System.out.println(c);
    }
}

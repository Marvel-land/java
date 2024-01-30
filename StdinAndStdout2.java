import java.io.*;
import java.util.*;

public class StdinAndStdout2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int myInt = scanner.nextInt();
        Double myDouble = scanner.nextDouble();
        String myString = scanner.nextLine();
        myString = scanner.nextLine();

        scanner.close();

        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
    }
}
import java.util.Scanner;

public class randomhighlow {
     public static void main(String[] args) {
         int num = (int) (Math.random() + 1);
         Scanner sc = new Scanner(System.in);
         int val = sc.nextInt();
         boolean res;
         while (res = true) {
             if (val < num) {
                 System.out.println("The Given Values is low");
                 res = false;
             } else if (val > num) {
                 System.out.println("The Given Values is high");
                 res = false;
             } else {
                 System.out.println("Matched!");
                 res = true;
             }
         }
     }
}

import java.util.Scanner;

public class multiplebirths {
    public static void main(String[] args) {
        int numberOfBabies;
        System.out.println("Enter number of babies: ");
        Scanner sc = new Scanner(System.in);
        numberOfBabies = sc.nextInt();

        switch (numberOfBabies) {
            case 1:
                System.out.println("Congratulations");
                break;
            case 2:
                System.out.println("Wow, Twins");
                break;
            case 3:
                System.out.println("Wow. Triplets");
            case 4:
            case 5:
                System.out.println("Unbelieveable");
                break;
            default:
                System.out.println("I don't believe");
        }
    }
}

public class foreach {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        int key = 2;

        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}

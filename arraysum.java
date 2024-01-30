public class arraysum {
    public static void main(String[] args) {
        int[] array = {1,5,10,25};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}

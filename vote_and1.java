public class vote_and1 {
    public static void main(String[] args) {
        int age = 15;
        String citizenship = "Indian";

        if (age >= 18 && citizenship == "Indian") {  // both should be satisfied
            System.out.println("Person may vote");
        } else {
            System.out.println("Person cannot vote");
        }
    }
}

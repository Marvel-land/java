public class evenlengthworkinstring {
    public static void main(String[] args) {
        String s = "I am Mathesh"
        for (String word : s.split(" "))
            if (word.length() % 2 == 0)
                System.out.println(word);
    }
}

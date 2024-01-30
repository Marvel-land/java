public class weather {
    public static void main(String[] args) {
        String weather = "rainy";
        switch (weather) {
            case "rainy":
                System.out.println("Take an Umbrella");
                break;
            case "sunny":
                System.out.println("Wear Sunglasses");
                break;
            default:
                System.out.println("Check Weather Forecast");
        }
    }
}

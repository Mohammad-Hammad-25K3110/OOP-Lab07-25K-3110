package Lab07_Tasks.Lab07_Task07;

public class Main {
    public static void main(String[] args) {
        Restaurant r1 = new FastFoodRestaurant("ABC");
        Restaurant r2 = new FineDiningRestaurant("DEF");
        Restaurant r3 = new CafeRestaurant("GHI");
        double distance = 10;
        System.out.println("Fast Food Delivery Fee: " + r1.calculateDeliveryFee(distance));
        System.out.println("Fine Dining Delivery Fee: " + r2.calculateDeliveryFee(distance));
        System.out.println("Cafe Delivery Fee: " + r3.calculateDeliveryFee(distance));
    }
}

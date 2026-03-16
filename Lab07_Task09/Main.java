package Lab07_Tasks.Lab07_Task09;

public class Main {
    public static void main(String[] args) {
        Ride r1 = new BikeRide();
        Ride r2 = new CarRide();
        Ride r3 = new LuxuryRide();
        double distance = 15;
        System.out.println("Bike Ride Fare: " + r1.calculateFare(distance));
        System.out.println("Car Ride Fare: " + r2.calculateFare(distance));
        System.out.println("Luxury Ride Fare: " + r3.calculateFare(distance));
    }
}

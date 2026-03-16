package Lab07_Tasks.Lab07_Task09;

public class LuxuryRide extends Ride{
    @Override
    public double calculateFare(double distance) {
        return distance * 20; // rate per km for luxury ride
    }
}

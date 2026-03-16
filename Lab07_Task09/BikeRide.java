package Lab07_Tasks.Lab07_Task09;

public class BikeRide extends Ride{
    @Override
    public double calculateFare(double distance) {
        return distance * 5;
    }
}

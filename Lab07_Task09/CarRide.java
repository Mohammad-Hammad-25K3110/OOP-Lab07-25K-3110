package Lab07_Tasks.Lab07_Task09;

public class CarRide extends Ride{
    @Override
    public double calculateFare(double distance) {
        return distance * 10;
}

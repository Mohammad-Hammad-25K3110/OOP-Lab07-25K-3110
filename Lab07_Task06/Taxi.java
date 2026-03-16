package Lab07_Tasks.Lab07_Task06;

public class Taxi extends Transport{
    private final double baseFare;
    public Taxi(double baseFare) {
        this.baseFare = baseFare;
    }

    @Override
    public double fare() {
        return baseFare * 2.0;
    }
}

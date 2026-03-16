package Lab07_Tasks.Lab07_Task06;

public class Bus extends Transport{
    private final double baseFare;
    public Bus(double baseFare) {
        this.baseFare = baseFare;
    }

    @Override
    public double fare() {
        return baseFare;
    }
}

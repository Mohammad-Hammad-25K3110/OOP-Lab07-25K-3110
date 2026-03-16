package Lab07_Tasks.Lab07_Task06;

public class Train extends Transport{
    private final double baseFare;
    public Train(double baseFare) {
        this.baseFare = baseFare;
    }

    @Override
    public double fare() {
        return baseFare * 1.5;
    }
}

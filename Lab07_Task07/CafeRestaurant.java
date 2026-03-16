package Lab07_Tasks.Lab07_Task07;

public class CafeRestaurant extends Restaurant{
    CafeRestaurant(String name){
        super(name);
    }

    @Override
    public double calculateDeliveryFee(double distance) {
        return distance * 7; // different per km formula
    }
}

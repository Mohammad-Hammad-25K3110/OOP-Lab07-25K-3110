package Lab07_Tasks.Lab07_Task07;

public class FastFoodRestaurant extends Restaurant{
    FastFoodRestaurant(String name){
        super(name);
    }

    @Override
    public double calculateDeliveryFee(double distance) {
        return distance * 5;
    }
}

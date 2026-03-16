package Lab07_Tasks.Lab07_Task06;

public class Main {
    public static void main(String[] args) {
        Transport t1 = new Bus(50);
        Transport t2 = new Train(50);
        Transport t3 = new Taxi(50);
        System.out.println("Bus fare: " + t1.fare());
        System.out.println("Train fare: " + t2.fare());
        System.out.println("Taxi fare: " + t3.fare());
    }
}

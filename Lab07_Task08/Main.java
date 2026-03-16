package Lab07_Tasks.Lab07_Task08;

public class Main {
    public static void main(String[] args) {
        SmartDevice d1 = new SmartLight();
        SmartDevice d2 = new SmartFan();
        SmartDevice d3= new SmartAC();
        d1.turnOn();
        d2.turnOn();
        d3.turnOn();
    }
}

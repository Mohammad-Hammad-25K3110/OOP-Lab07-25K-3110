package Lab07_Tasks.Lab07_Task03;

public class PayPal extends Payment{
    PayPal(double amount){
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing payment through PayPal");
    }
}

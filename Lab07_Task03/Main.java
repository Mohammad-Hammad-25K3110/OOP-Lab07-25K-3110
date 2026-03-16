package Lab07_Tasks.Lab07_Task03;

public class Main {
    public static void main(String[] args) {
        Payment p1 = new CreditCard(1000);
        Payment p2 = new DebitCard(1000);
        Payment p3 = new PayPal(1000);
        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}

package Lab07_Tasks.Lab07_Task03;

public class Payment {
    double amount;
    public Payment(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Processing generic payment \nAmount : " + this.amount);
    }
}

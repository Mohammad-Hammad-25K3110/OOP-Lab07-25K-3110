package Lab07_Tasks.Lab07_Task03;

public class CreditCard extends Payment{
    CreditCard(double amount){
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing payment through Credit Card \nAmount : " + this.amount);
    }
}

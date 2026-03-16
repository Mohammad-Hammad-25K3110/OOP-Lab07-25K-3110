package Lab07_Tasks.Lab07_Task03;

public class DebitCard extends Payment{
    DebitCard(double amount){
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing payment through Debit Card \nAmount : " + this.amount);
    }
}

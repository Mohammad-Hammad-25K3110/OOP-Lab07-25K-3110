package Lab07_Tasks.Lab07_Task05;

public class SMSNotification extends Notification{
    SMSNotification(String message){
        super(message);
    }

    @Override
    public void send() {
        System.out.println("Sending SMS notification");
        System.out.println("Message : " + this.message);
    }
}

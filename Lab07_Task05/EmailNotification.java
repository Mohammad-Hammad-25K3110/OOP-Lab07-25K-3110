package Lab07_Tasks.Lab07_Task05;

public class EmailNotification extends Notification{
    EmailNotification(String message){
        super(message);
    }

    @Override
    public void send() {
        System.out.println("Sending email notification");
        System.out.println("Message : " + this.message);
    }
}

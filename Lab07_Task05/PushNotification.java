package Lab07_Tasks.Lab07_Task05;

public class PushNotification extends Notification{
    PushNotification(String message) {
        super(message);
    }

    @Override
    public void send() {
        System.out.println("Sending push notification");
        System.out.println("Message : " + this.message);
    }
}

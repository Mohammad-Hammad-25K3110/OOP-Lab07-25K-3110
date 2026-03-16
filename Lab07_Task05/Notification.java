package Lab07_Tasks.Lab07_Task05;

public class Notification {
    String message;
    public Notification(String message) {
        this.message = message;
    }

    public void send() {
        System.out.println("Sending generic notification");
        System.out.println("Message : " + this.message);
    }
}

package Lab07_Tasks.Lab07_Task05;

public class Main {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification("Hello");
        Notification n2 = new SMSNotification("Bye");
        Notification n3 = new PushNotification("Thanks");
        n1.send();
        n2.send();
        n3.send();
    }
}

package CodingTechniques.DesignPatterns.FactoryPattern;

public class App {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification = notificationFactory.createNotification("gmail");
        notification.notifyMessage();
    }
}

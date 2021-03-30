package CodingTechniques.DesignPatterns.FactoryPattern;

public class GmailNotification implements Notification{
    @Override
    public void notifyMessage() {
        System.out.println("Gmail notification.....");
    }
}

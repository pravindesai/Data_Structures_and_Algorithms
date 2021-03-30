package CodingTechniques.DesignPatterns.FactoryPattern;

public class SkypeNotification implements Notification{
    @Override
    public void notifyMessage() {
        System.out.println("Skype notification.....");
    }
}

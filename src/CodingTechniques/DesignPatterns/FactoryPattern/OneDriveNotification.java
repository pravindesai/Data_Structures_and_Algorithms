package CodingTechniques.DesignPatterns.FactoryPattern;

public class OneDriveNotification implements Notification{
    @Override
    public void notifyMessage() {
        System.out.println("OneDrive notification.....");
    }
}

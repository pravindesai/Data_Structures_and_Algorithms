package CodingTechniques.DesignPatterns.FactoryPattern.Entities;

import CodingTechniques.DesignPatterns.FactoryPattern.Notification;

public class OneDriveNotification implements Notification {
    @Override
    public void notifyMessage() {
        System.out.println("OneDrive notification.....");
    }
}

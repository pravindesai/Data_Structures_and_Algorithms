package CodingTechniques.DesignPatterns.FactoryPattern.Entities;

import CodingTechniques.DesignPatterns.FactoryPattern.Notification;

public class GmailNotification implements Notification {
    @Override
    public void notifyMessage() {
        System.out.println("Gmail notification.....");
    }
}

package CodingTechniques.DesignPatterns.FactoryPattern.Entities;

import CodingTechniques.DesignPatterns.FactoryPattern.Notification;

public class SkypeNotification implements Notification {
    @Override
    public void notifyMessage() {
        System.out.println("Skype notification.....");
    }
}

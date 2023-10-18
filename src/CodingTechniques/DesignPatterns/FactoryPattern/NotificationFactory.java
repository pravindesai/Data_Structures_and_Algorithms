package CodingTechniques.DesignPatterns.FactoryPattern;

import CodingTechniques.DesignPatterns.FactoryPattern.Entities.GmailNotification;
import CodingTechniques.DesignPatterns.FactoryPattern.Entities.OneDriveNotification;
import CodingTechniques.DesignPatterns.FactoryPattern.Entities.SkypeNotification;

public class NotificationFactory {
    public Notification createNotification(String Type){

        if (Type.isEmpty() || Type == null || Type.isEmpty()) {
            return null;
        }

        if (Type.equalsIgnoreCase("gmail")){
            return new GmailNotification();
        }else if (Type.equalsIgnoreCase("onedrive")){
            return new OneDriveNotification();
        }else if (Type.equalsIgnoreCase("skype")){
            return new SkypeNotification();
        }
        else {
            return null;
        }
    }
}

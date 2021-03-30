package CodingTechniques.DesignPatterns.FactoryPattern;

public class NotificationFactory {
    public Notification createNotification(String Type){

        if (Type.isEmpty() || Type == null || Type.isBlank()) {
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

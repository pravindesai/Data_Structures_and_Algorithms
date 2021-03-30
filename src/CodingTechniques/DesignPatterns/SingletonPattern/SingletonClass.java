package CodingTechniques.DesignPatterns.SingletonPattern;

public class SingletonClass {

    private static SingletonClass singletonClassObject = null;
    static int ObjectCounter = 0;

    private SingletonClass(){
        ObjectCounter++;
    }

    public static SingletonClass getInstance(){
        if (singletonClassObject == null)
            singletonClassObject = new SingletonClass();
        return singletonClassObject;
    }

    public void ObjectsCreated(){
        System.out.println("Total Objects created: "+ObjectCounter);
    }
}

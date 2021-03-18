package Common_Interview_Programs;

class CountObjects{
    static int OBJ_Counter = 0;
    CountObjects() {
        OBJ_Counter++;
    }

    public static int get_Total_Object_Count() {
        return OBJ_Counter;
    }
}

public class Count_Number_Of_Objects_Of_Class {

    public static void main(String[] args) {
        CountObjects object = new CountObjects();
        CountObjects object1 = new CountObjects();
        CountObjects object2 = new CountObjects();
        CountObjects object3 = new CountObjects();

        System.out.println("Total Objects created: "+CountObjects.get_Total_Object_Count());
    }

}


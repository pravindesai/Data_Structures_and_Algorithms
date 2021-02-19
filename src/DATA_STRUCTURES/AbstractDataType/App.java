package DATA_STRUCTURES.AbstractDataType;

public class App {
    public static void main(String[] args) {

        ADT_Demo adt_demo = new ADT_Demo("Count");
                    adt_demo.Increment();
                    adt_demo.Increment();
                    adt_demo.Increment();

        System.out.println(adt_demo.getCurrentValue());


    }
}

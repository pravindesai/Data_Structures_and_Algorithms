package DATA_STRUCTURES.AbstractDataType;

public class ADT_Demo {

    private String name = null;
    private int vlaue = 0;

    public ADT_Demo(String str) {
        this.name = str;
    }

    @Override
    public String toString() {
        return name+ " "+vlaue;
    }

    public void Increment(){
        vlaue++;
    }

    public int getCurrentValue(){
        return vlaue;
    }

}
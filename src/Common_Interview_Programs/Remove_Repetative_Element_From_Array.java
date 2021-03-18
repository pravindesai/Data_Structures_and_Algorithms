package Common_Interview_Programs;

public class Remove_Repetative_Element_From_Array {
    public static void main(String[] args) {

        int[] Data_Array = {1,2,3,8,3,4,5,6,6,7,8,9,10};
        int[] tempArray = new int[Data_Array.length];
        int pos=0;

        for (int item:
             Data_Array) {

            if (!isExists(tempArray, item)){
                tempArray[pos++] = item;
            }

        }



        for (int iterator=0; iterator<pos; iterator++){

            System.out.println(": "+tempArray[iterator]);

        }

    }

    static boolean isExists(int[] array, int element){

        for (int item:
             array) {
            if (item == element){
                return true;
            }
        }
        return false;
    }
}

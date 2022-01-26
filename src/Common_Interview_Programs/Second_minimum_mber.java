package Common_Interview_Programs;

public class Second_minimum_mber {
    public static void main(String[] args) {
        int[] array = {5,3,2,6,8,1,3,7,89,34,6};

        int second_minimum_number = getSecondMinimumNumberFromArray(array);
        System.out.println("Second Minimum Number in Array is ->  "+second_minimum_number);
    }

    public static int getSecondMinimumNumberFromArray(int[] array){
        int min = array[0];
        int second_min = array[0];

        for (int i=0; i<array.length; i++){
            if (array[i]<=min){
                second_min = min;
                min = array[i];
            }
        }
        return second_min;
    }

}

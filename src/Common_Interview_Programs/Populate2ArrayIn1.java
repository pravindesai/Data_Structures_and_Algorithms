package Common_Interview_Programs;

import java.util.Arrays;

public class Populate2ArrayIn1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int arr3[] = new int[arr1.length+arr2.length];

        int itr = 0;
        int index=0;
        boolean SWITCH = true;

        while (itr<(arr1.length+arr2.length)){

            if (SWITCH){
            arr3[itr] = arr1[index];
            }else {
                arr3[itr] = arr2[index];
                index++;
            }

            SWITCH=!SWITCH;
            itr++;
        }

        System.out.println(Arrays.toString(arr3));

    }
}

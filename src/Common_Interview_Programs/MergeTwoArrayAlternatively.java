package Common_Interview_Programs;

import java.util.Arrays;

public class MergeTwoArrayAlternatively {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {11,22,33,44,55,66};

        System.out.println(Arrays.toString(mergedArray(arr1, arr2)));

    }

    private static int[] mergedArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length+arr2.length];
        int index=0, itr = 0;
        boolean ARRAYSWITCH = true;
        while (itr<(arr1.length+arr2.length)){
            if (ARRAYSWITCH){
                arr3[itr] = arr1[index];
            }else {
                arr3[itr] = arr2[index];
                index++;
            }
            itr++;
            ARRAYSWITCH = !ARRAYSWITCH;
        }
        return arr3;
    }

}

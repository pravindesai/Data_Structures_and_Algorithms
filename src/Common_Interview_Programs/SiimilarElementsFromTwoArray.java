package Common_Interview_Programs;

import java.util.HashMap;

public class SiimilarElementsFromTwoArray {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {11,12,3,13,14,1,15};

        printSimilarElements1(arr1, arr2);
        printSimilarElements2(arr1, arr2);
    }

    private static void printSimilarElements2(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        int fArrayIndex = 0;
        int lArrayIndex = 0;

        while ((fArrayIndex != arr1.length-1) || (lArrayIndex != arr2.length-1)){

            if (fArrayIndex<arr1.length){
                if (numberMap.get(arr1[fArrayIndex])==null){
                    numberMap.put(arr1[fArrayIndex],1);
                }else {
                    numberMap.put(arr1[fArrayIndex], numberMap.get(arr1[fArrayIndex])+1);
                }

                fArrayIndex++;
            }
            if (lArrayIndex<arr2.length){

                if (numberMap.get(arr2[lArrayIndex])==null){
                    numberMap.put(arr2[lArrayIndex],1);
                }else {
                    numberMap.put(arr2[lArrayIndex], numberMap.get(arr2[lArrayIndex])+1);
                }

                lArrayIndex++;
            }
        }

        System.out.println(numberMap);
    }

    private static void printSimilarElements1(int[] arr1, int[] arr2) {
        for (int number:arr1){
            if (isElementPresent(number, arr2)){
                System.out.print(number+"  ");
            }
        }
    }

    private static boolean isElementPresent(int ele, int[] arr2){
        for (int e:arr2){
            if (e==ele) return true;
        }
        return false;
    }
}

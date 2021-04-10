package Algorithms.Sorting_Algorithms.InsertionSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] array = new int[]{2,5,4,6,87,9,0,5,4,3,5,7,8,8,9,45,76};
        InsertionSort insertionSort = new InsertionSort(array);
        System.out.println("Sorted array: "+ Arrays.toString(insertionSort.getArray()));

    }
}

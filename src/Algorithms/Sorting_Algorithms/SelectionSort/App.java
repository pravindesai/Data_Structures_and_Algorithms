package Algorithms.Sorting_Algorithms.SelectionSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] array = new int[]{3,4,2,1,4,5,6,8,56,99,6,42};

        SelectionSort selectionSort = new SelectionSort(array);
        System.out.println("Sorted array: "+ Arrays.toString(selectionSort.getArray()));
    }
}

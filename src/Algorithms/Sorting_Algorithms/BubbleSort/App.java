package Algorithms.Sorting_Algorithms.BubbleSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] array = new int[]{1,5,4,2,3,6,7,9,8};

        BubbleSort bubbleSort = new BubbleSort(array);
        System.out.println("Srted Array : "+ Arrays.toString(bubbleSort.getArray()));
    }
}

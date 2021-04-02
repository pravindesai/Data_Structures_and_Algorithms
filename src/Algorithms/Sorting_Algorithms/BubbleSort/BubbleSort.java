package Algorithms.Sorting_Algorithms.BubbleSort;

public class BubbleSort {
    int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
        sort(array);
    }

    private void sort(int[] array) {

        for(int i=0;i<array.length-1;i++){
            for (int j=i;j<=array.length-1;j++){
                if (array[j]<=array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public int[] getArray() {
        return array;
    }
}

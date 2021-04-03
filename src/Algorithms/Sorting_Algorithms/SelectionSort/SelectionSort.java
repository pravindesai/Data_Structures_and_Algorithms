package Algorithms.Sorting_Algorithms.SelectionSort;

public class SelectionSort {
    int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
        sortArray(array);
    }

    private void sortArray(int[] array){
        //Selection sort


        for(int i =0; i<array.length; i++){
            int min = i;
            for (int j=i+1; j<array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }



    }

    public int[] getArray() {
        return array;
    }
}

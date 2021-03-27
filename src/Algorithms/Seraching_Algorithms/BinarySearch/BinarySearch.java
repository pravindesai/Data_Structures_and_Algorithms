package Algorithms.Seraching_Algorithms.BinarySearch;

public class BinarySearch {
    int[] SortedArray;
    int itemToFind;
    int position = -1;

    public BinarySearch() {
    }

    public BinarySearch(int[] sortedArray, int itemToFind) {
        SortedArray = sortedArray;
        this.itemToFind = itemToFind;

        //TODO
    }

    public int Search(int[] array, int item){
        int p = 0 , q;
        int r = array.length-1;
        while (p<=r){
            q = (p+r)/2;
            if (item < array[q])
                r = q-1;
            else if(item > array[q])
                p = q+1;
            else return q;

        }
        return -1;
    }
}

package Algorithms.Seraching_Algorithms.BinarySearch;

public class App {
    public static void main(String[] args) {
    //Only for sorted arrays

        int[] array = new int[]{1,2,3,4,5};
        int item = 3;

        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Found "+ item +" at : "+binarySearch.Search(array, item));
    }
}

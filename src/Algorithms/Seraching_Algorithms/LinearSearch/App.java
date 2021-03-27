package Algorithms.Seraching_Algorithms.LinearSearch;

public class App {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int item = 1;

        LinearSearch linearSearch = new LinearSearch(array, item);
        System.out.println("POSIITON: "+linearSearch.getpositionInArray());

        System.out.println("POSIITON: "+linearSearch.Serach(new int[]{2,5,3,6}, 3));

    }

}

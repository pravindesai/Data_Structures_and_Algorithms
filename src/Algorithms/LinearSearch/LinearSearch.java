package Algorithms.LinearSearch;

public class LinearSearch {
    int[] element_array;
    int itemToFind;
    int positionInArray = -1;

    LinearSearch(){}

    LinearSearch(int[] array, int item){
        element_array = array;
        itemToFind = item;

        for(int iterator = 0; iterator<element_array.length; iterator++){
            if (element_array[iterator] == itemToFind)
                positionInArray = iterator;
        }
    }

    public int Serach(int[] array, int item){
        for(int iterator = 0; iterator<array.length; iterator++){
            if (array[iterator] == item)
                return iterator;
        }
        return -1;
    }


    public int[] getElement_array() {
        return element_array;
    }

    public int getItemToFind() {
        return itemToFind;
    }

    public int getpositionInArray() {
        return positionInArray;
    }
}

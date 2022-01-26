package Common_Interview_Programs;

public class SecondSmallest {


    public static void main(String[] args) {
        int []arr = {5, 10, 1, 0, 2, 3, 4, 4};
        print2nd(arr, arr.length-1);
    }

    public static void print2nd(int arr[], int arr_len){

        int smallest = arr[0];
        int sec_smallest = arr[0];

        int largest = arr[0];
        int sec_largest = arr[0];

        for (int i:arr){
            if(i<smallest)
            {
                sec_smallest = smallest;
                smallest=i;
            }
            if(i<sec_smallest && i>smallest){
                sec_smallest = i;
            }

            if(i>=largest){
                sec_largest = largest;
                largest = i;
            }

        }

        System.out.println("sec small-->"+sec_smallest);
        System.out.println("sec large-->"+sec_largest);

    }

}

package Common_Interview_Programs;

public class Print_Fibonacci_series {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 ....

        int first_Number = 0;
        int second_Number = 1;
        int temp;

        int limit = 10;

        System.out.print(first_Number+" - ");
        System.out.print(second_Number+" - ");

        for (int iterator = 0; iterator<limit; iterator++){

            temp = first_Number+second_Number;
            System.out.print(temp+" - ");

            first_Number = second_Number;
            second_Number = temp;

        }


    }
}

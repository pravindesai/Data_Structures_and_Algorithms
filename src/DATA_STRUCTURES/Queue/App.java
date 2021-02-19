package DATA_STRUCTURES.Queue;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DATA_STRUCTURES.Stack Size: ");
        CustomQueue queue = new CustomQueue(sc.nextInt());

        int Choice=0;

        while(true){
            System.out.println("""

                    1.Displays
                    2.Enqueue
                    3.Dequeue
                    4.PEAK
                    5.IsEmpty
                    6.isFull
                    """);
            Choice = sc.nextInt();
            switch (Choice){
                case 1:
                    queue.VIEW_QUEUE();
                    break;
                case 2:
                    if(!queue.isFull()){
                        System.out.println("Enter Item:  ");
                        queue.Enqueue(sc.nextLong());
                    }
                    break;
                case 3:
                    if(!queue.isEmpty()){
                        System.out.println("Dequeued: "+queue.Dequeue());
                    }
                    break;
                case 4:
                    if(!queue.isEmpty()){
                        System.out.println("Top element is  "+queue.PEAK());
                    }
                    break;
                case 5:
                    System.out.println("Is DATA_STRUCTURES.Queue Empty: "+queue.isEmpty());
                    break;
                case 6:
                    System.out.println("Is DATA_STRUCTURES.Queue FULL: "+queue.isFull());
                    break;
                default:
                    System.out.println("INVALID INPUT");
                    break;
            }
        }

    }
}

package DATA_STRUCTURES.Queue;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DATA_STRUCTURES.Stack Size: ");
        CustomQueue queue = new CustomQueue(sc.nextInt());

        int Choice=0;

        while(true){
            System.out.println( "\n" +
                    "1.Displays\n" +
                    "2.Enqueue\n" +
                    "3.Dequeue\n" +
                    "4.PEAK\n" +
                    "5.IsEmpty\n" +
                    "6.isFull\n");
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

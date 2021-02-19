package DATA_STRUCTURES.Stack;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DATA_STRUCTURES.Stack Size: ");
        CustomStack stack = new CustomStack(sc.nextInt());

        int Choice=0;

        while(true){
            System.out.println( "\n" +
                                "1.Displays\n" +
                                "2.PUSH\n" +
                                "3.POP\n" +
                                "4.PEAK\n" +
                                "5.IsEmpty\n" +
                                "6.isFull\n");
            Choice = sc.nextInt();
            switch (Choice){
                case 1:
                        stack.ITERATE();
                    break;
                case 2:
                        if(!stack.isFull()){
                            System.out.println("Enter Item:  ");
                            stack.PUSH(sc.nextInt());
                        }
                    break;
                case 3:
                        if(!stack.isEmpty()){
                            System.out.println("Popped: "+stack.POP());
                        }
                    break;
                case 4:
                        if(!stack.isEmpty()){
                            System.out.println("Top element is  "+stack.PEAK());
                        }
                    break;
                case 5:
                        System.out.println("Is DATA_STRUCTURES.Stack Empty: "+stack.isEmpty());
                    break;
                case 6:
                        System.out.println("Is stack FULL: "+stack.isFull());
                    break;
                default:
                        System.out.println("INVALID INPUT");
                    break;
            }
        }
    }
}

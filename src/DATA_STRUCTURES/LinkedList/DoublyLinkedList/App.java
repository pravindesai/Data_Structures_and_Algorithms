package DATA_STRUCTURES.LinkedList.DoublyLinkedList;

import DATA_STRUCTURES.LinkedList.Node;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        int Choice=0;

        while(true){
            Node deletedNode,foundNode;
            int index,data;

            System.out.println( "\n" +
                    "1.Display\n" +
                    "2.Count Toatal Elements\n" +
                    "3.Check Is Empty\n" +

                    "4.InsertAtBeginning\n" +
                    "5.InsertAtEnd\n" +
                    "6.InsertAtIndex\n"+

                    "7.DeleteAtBeginning\n"+
                    "8.DeleteAtEnd\n"+
                    "9.DeleteAtIndex\n"+

                    "10.UpdateAtBeginning\n"+
                    "11.UpdateAtEnd\n"+
                    "12.UpdateAtIndex\n"+

                    "13.Search\n"+
                    "14.Get Head and End Node:\n"+
                    "15.Traverse reverse: \n");

            Choice = sc.nextInt();
            switch (Choice){
                case 0:

                    break;
                case 1:
                    linkedList.Display();
                    break;
                case 2:
                    System.out.println("Total Elements: "+linkedList.CountTotalElements());
                    break;
                case 3:
                    System.out.println("Is Linked List Empty:   "+linkedList.IsEmpty());
                    break;
                case 4:
                    System.out.println("Enter Integer to Insert At Beginning ");
                    linkedList.InsertAtBeginning(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Enter Integer to Insert At End ");
                    linkedList.InsertAtEnd(sc.nextInt());
                    break;
                case 6:

                    System.out.println("Enter index to Insert ");
                    index = sc.nextInt();
                    System.out.println("Enter Integer to Insert At Index "+index);
                    data = sc.nextInt();

                    linkedList.InsertAtIndex(index,data);
                    break;
                case 7:
                    deletedNode = linkedList.DeleteAtBeginning();
                    System.out.println("DELETED: "+deletedNode.Data);
                    break;
                case 8:
                    deletedNode = linkedList.DeleteAtEnd();
                    System.out.println("DELETED: "+deletedNode.Data);
                    break;

                case 9:
                    System.out.println("Enter index to Delete ");
                    index = sc.nextInt();
                    deletedNode = linkedList.DeleteAtIndex(index);
                    System.out.println("DELETED: "+deletedNode.Data);
                    break;

                case 10:
                    System.out.println("Enter data to update at Beginning ");
                    data = sc.nextInt();
                    linkedList.UpdateAtBeginning(data);
                    break;

                case 11:
                    System.out.println("Enter data to update at End ");
                    data = sc.nextInt();
                    linkedList.UpdateAtEnd(data);
                    break;

                case 12:

                    System.out.println("Enter index to Insert ");
                    index = sc.nextInt();
                    System.out.println("Enter Integer to Update At Index "+index);
                    data = sc.nextInt();

                    linkedList.UpdateAtIndex(index, data);
                    break;

                case 13:
                    System.out.println("Enter Index to Serch node ");
                    foundNode = linkedList.Search(sc.nextInt());
                    System.out.println("FOUND: "+foundNode.Data);
                    break;

                case 14:
                    System.out.println("HEAD NODE:  "+linkedList.getHeadNode().Data);
                    System.out.println("END NODE:  "+linkedList.getEndNode().Data);
                    break;

                case 15:
                    System.out.println("Reverse List:  ");
                    linkedList.DisplayReverse();
                    break;

                default:
                    System.out.println("No option Found");
                    break;
            }
        }
    }
}

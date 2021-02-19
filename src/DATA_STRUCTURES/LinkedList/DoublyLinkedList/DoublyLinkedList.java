package DATA_STRUCTURES.LinkedList.DoublyLinkedList;

import DATA_STRUCTURES.LinkedList.Node;

public class DoublyLinkedList {
    private Node HeadNode;
    private Node EndNode;

    public DoublyLinkedList() {
        HeadNode = new Node();
        HeadNode = null;
    }

    public boolean IsEmpty(){
        return (HeadNode == null);
    }
    public int CountTotalElements(){
        int Count=0;
        Node tempNode = HeadNode;

        while (tempNode != null){
            Count++;
            tempNode = tempNode.Next;

        }
        return Count;
    }

    public void InsertAtBeginning(int data){
        Node newNode = new Node();
        newNode.Prev = null;
        newNode.Data = data;
        newNode.Next = null;

        if(HeadNode == null){
            HeadNode = newNode;
            return;
        }

        newNode.Next = HeadNode;
        HeadNode.Prev  =newNode;
        HeadNode = newNode;


    }
    public void InsertAtEnd(int data){
        Node newNode = new Node();
        newNode.Data = data;
        newNode.Next = null;
        newNode.Prev = null;

        if(HeadNode == null){
            HeadNode = newNode;
            return;
        }
        Node TempNode = HeadNode;

        while (TempNode.Next != null){
            TempNode = TempNode.Next;
        }

        TempNode.Next = newNode;
        newNode.Prev  = TempNode;
    }
    public void InsertAtIndex( int index, int data){
        Node newNode = new Node();
        newNode.Data = data;
        newNode.Next = null;
        int n=1;

        if (index<0){
            return;
        }
        if(index == 0){
            InsertAtBeginning(data);
            return;
        }

        Node TempNode = HeadNode;

        while (TempNode.Next != null && index!=n){
            TempNode = TempNode.Next;
            n++;
        }

        newNode.Next = TempNode.Next;
        TempNode.Next.Prev = newNode;
        newNode.Prev = TempNode;
        TempNode.Next = newNode;

    }



    public Node DeleteAtBeginning(){
        if (HeadNode == null){
            return null;
        }
        Node tempNode = HeadNode;
        HeadNode = HeadNode.Next;
        HeadNode.Prev = null;
        return tempNode;
    }
    public Node DeleteAtEnd(){
        Node backNode = new Node();
        if(HeadNode == null)
            return null;

        Node TempNode = HeadNode;

        while (TempNode.Next != null){
            backNode = TempNode;
            TempNode = TempNode.Next;
        }
        backNode.Next = null;
        return TempNode;
    }
    public Node DeleteAtIndex(int index){
        if (HeadNode==null)
            return null;

        Node backNode = new Node();
        int n=0;

        if (index<0){
            return null;
        }
        if(index == 0){
            DeleteAtBeginning();
        }

        Node TempNode = HeadNode;

        while (TempNode.Next != null && index!=n){
            backNode = TempNode;
            TempNode = TempNode.Next;
            n++;
        }

        backNode.Next = TempNode.Next;
        TempNode.Next.Prev = TempNode.Prev;
        return TempNode;

    }



    public void UpdateAtBeginning(int data){
        HeadNode.Data = data;
    }
    public void UpdateAtEnd(int data){
        if(HeadNode == null)
            return;

        Node TempNode = HeadNode;

        while (TempNode.Next != null){
            TempNode = TempNode.Next;
        }
        TempNode.Data = data;
    }
    public void UpdateAtIndex(int index, int data){
        if (HeadNode==null)
            return;

        int n=0;

        if (index<0){
            return;
        }
        if(index == 0){
            UpdateAtBeginning(data);
        }

        Node TempNode = HeadNode;

        while (TempNode.Next != null && index!=n){
            TempNode = TempNode.Next;
            n++;
        }
        TempNode.Data = data;
    }


    public Node Search(int index){
        if (HeadNode==null)
            return null;

        int n=0;

        if (index<0){
            return null;
        }
        if(index == 0){
            return HeadNode;
        }

        Node TempNode = HeadNode;

        while (TempNode.Next != null && index!=n){
            TempNode = TempNode.Next;
            n++;
        }
        return TempNode;
    }

    public void Display(){
        System.out.println("***");

        Node tempNode = HeadNode;

        while (tempNode != null){

            System.out.println(tempNode.Data);
            tempNode = tempNode.Next;

        }

        System.out.println("***");
    }
    public void DisplayReverse(){
        System.out.println("***");

        Node endNode = getEndNode();

        while (endNode != null){

            System.out.println(endNode.Data);
            endNode = endNode.Prev;

        }

        System.out.println("***");
    }


    public Node getHeadNode() {
        return HeadNode;
    }

    public Node getEndNode() {
        Node EndNode = HeadNode;
        while (EndNode.Next != null){
            EndNode = EndNode.Next;
        }
        return EndNode;
    }
}

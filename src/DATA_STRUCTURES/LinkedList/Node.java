package DATA_STRUCTURES.LinkedList;

public class Node {
    public Node Next = null;
    public int Data;
    public Node Prev = null;   //Used in only Doubly Linked List

    public void DisplyNode(){
        System.out.println("DATA: "+this.Data);
    }
}

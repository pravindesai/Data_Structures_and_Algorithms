package DATA_STRUCTURES.Stack;

public class CustomStack {
    private int     MAX_SIZE;
    private long[]  stackArray;
    private int     top;

    public CustomStack(int SIZE){
        this.MAX_SIZE = SIZE;
        this.stackArray = new long[MAX_SIZE];
        this.top = -1;
    }

    public void PUSH(long input){

        //top++;
        SHIFT_STACK();
        stackArray[0] = input;

    }

    public long POP(){

        int old_top = top;
        top--;
        return stackArray[old_top];

    }

    public long PEAK(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return (MAX_SIZE-1 == top);
    }

    public void ITERATE(){
        for (long item:stackArray) {
            System.out.println(item+" _ ");
        }
    }

    private void SHIFT_STACK() {
        for (int i=0;i<stackArray.length;i++){
            stackArray[i+1]=stackArray[i];
        }
    }

}

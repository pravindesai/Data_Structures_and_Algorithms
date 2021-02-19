package DATA_STRUCTURES.Queue;

public class CustomQueue {
    private  int MAXSIZE;
    private long[] queArray;
    private int FRONT,REAR,nItems;

    public CustomQueue(int MAXSIZE) {
        this.MAXSIZE = MAXSIZE;
        this.queArray = new long[MAXSIZE];
        FRONT = 0;
        REAR = -1;
        nItems = 0;
    }

    public void Enqueue(long item){
        REAR++;
        queArray[REAR] = item;
        nItems++;
    }

    public long Dequeue(){
        long TEMP = queArray[FRONT];
        FRONT++;
        if(FRONT == MAXSIZE){
            FRONT = 0;
        }
        nItems--;
        SHIFT_QUEUE();

        return TEMP;

    }

    private void SHIFT_QUEUE() {
        for (int i=1;i<queArray.length;i++){
            queArray[i-1]=queArray[i];
        }
    }

    public long PEAK(){
        return queArray[FRONT];
    }

    public boolean isEmpty(){
        return (    nItems==0 );
    }

    public boolean isFull(){
        return (nItems==MAXSIZE);
    }

     public void VIEW_QUEUE(){
         for (long item:queArray) {
             System.out.print(item+" _ ");
         }
         System.out.println("");
     }

}

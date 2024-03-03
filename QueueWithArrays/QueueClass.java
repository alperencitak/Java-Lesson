package QueueWithArrays;

public class QueueClass {
    int [] dizi;
    int front,rear,size;
    public QueueClass(int size){
        this.size = size;
        dizi=new int[size];
        front=0;rear=-1;
    }
    
    void enQueue(int data){
        if(isFull()==true){
            System.out.println("Queue is full.");
        }
        else{
            rear++;
            dizi[rear]=data;
        }
    }
    void deQueue(){
        if(isEmpty()==true){
            System.out.println("Queue is empty.");
        }
        else{
            for(int i=1;i<=rear;i++){
            dizi[i-1]=dizi[i];
            }
            rear--;
        } 
    }
    boolean isFull(){
        return rear==size-1;
    }
    boolean isEmpty(){
        return rear==-1;
    }
    void seeQueue(){
        for(int i=0;i<size;i++){
            System.out.print(dizi[i] + " ");
        }
    }
}

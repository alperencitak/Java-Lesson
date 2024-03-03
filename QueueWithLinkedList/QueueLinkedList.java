package QueueWithLinkedList;

public class QueueLinkedList {
    Node5 front,rear;
    int size,count;
    public QueueLinkedList(int size){
        this.size = size;
        count=0;
        front=null;
        rear=null;
    }
    void enQueue(int data){
        if(isFull()==true){
            System.out.println("Queue is full.");
        }
        else{
            Node5 eleman = new Node5(data);
            if(front==null){
                front=eleman;
                rear=eleman;
                count++;
            }
            else{
                
                rear.next=eleman;
                rear=eleman;
                count++;
            }
        }
    }
    void deQueue(){
        if(isEmpty()==true){
            System.out.println("Queue is empty");
        }
        else{
            front=front.next;
            count--;
        }
    }
    boolean isEmpty(){
        return front==null;
    }
    boolean isFull(){
        return count==size;
    }
    void seeQueue(){
        Node5 temp = front;
        for(int i=0;i<count;i++){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}

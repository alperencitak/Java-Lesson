package QueueWithArrays;

public class MainCls {
    public static void main(String[] args){
        QueueClass queue = new QueueClass(3);
        queue.deQueue();
        queue.enQueue(43);
        queue.enQueue(81);
        queue.enQueue(29);
        queue.enQueue(65);
        queue.deQueue();
        queue.enQueue(7);
        
        queue.seeQueue();
    }
}

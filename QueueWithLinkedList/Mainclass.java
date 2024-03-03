package QueueWithLinkedList;

public class Mainclass {
    public static void main(String[] args){
        QueueLinkedList queue = new QueueLinkedList(3);
        queue.deQueue();
        queue.enQueue(25);
        queue.enQueue(19);
        queue.enQueue(67);
        queue.enQueue(83);
        queue.deQueue();
        queue.enQueue(4);
        
        queue.seeQueue();
        
        System.out.println("\nSistem sonundaki eleman : " + queue.rear.data);
        System.out.println("Sistem başındaki eleman : " + queue.front.data);
        System.out.println("Sistem eleman sayısı : " + queue.count);
    }
}

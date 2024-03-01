package StackWithLinkedList;

public class StackListeYapisi {
    int size;
    int count;
    Node4 top=null;
    public StackListeYapisi(int size){
        this.size=size;
        count=0;
    }
    void push(int data){
        Node4 eleman = new Node4(data);
        if(count==0){
            top=eleman;
            top.next=null;
            count++;
        }
        else if(isFull()==true){
            System.out.println("Stack is full.");
        }
        else{
            eleman.next=top;
            top = eleman;
            count++;
        }
    }
    void pop(){
        if(isEmpty()==true){
            System.out.println("Stack is empty.");
        }
        else if(count==1){
            top = null;
            count--;
        }
        else{
            top=top.next;
            count--;
        }
    }
    boolean isFull(){
        return count==size;
    }
    boolean isEmpty(){
        return count==0;
    }
    void seeStack(){
        Node4 temp=top;
        for(int i=0;i<count;i++){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

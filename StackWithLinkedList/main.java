package StackWithLinkedList;

public class main {
    public static void main(String[] args){
        StackListeYapisi stackList = new StackListeYapisi(3);
        System.out.println(stackList.isFull());
        System.out.println(stackList.isEmpty());
        stackList.pop();
        stackList.push(14);
        stackList.push(39);
        System.out.println(stackList.isFull());
        System.out.println(stackList.isEmpty());
        stackList.push(81);
        stackList.pop();
        stackList.push(67);
        stackList.push(43);
        System.out.println(stackList.isFull());
        System.out.println(stackList.isEmpty());
        
        stackList.seeStack();
    }
}

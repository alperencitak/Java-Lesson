package StackWithArrays;

public class Test {
    public static void main(String[] args){
        stackWithArrays stack = new stackWithArrays(5);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.pop();
        stack.push(56);
        stack.push(25);
        stack.push(19);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.pop();
        stack.push(37);
        stack.push(84);
        stack.push(6);
        stack.push(71);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.list();
    }
}

package StackWithArrays;

class stackWithArrays {
    int dizi[],indis,size;
    public stackWithArrays(int size){
        this.size = size;
        dizi=new int[size];
        indis=-1;
    }
    void push(int data){
        if(indis==size-1){
            System.out.println("Stack is full.");
        }
        else{
            indis++;
            dizi[indis] = data;
            System.out.println("Data pushed.");
        }
    }
    void pop(){
        if(indis==-1){
            System.out.println("Stack is empty.");
        }
        else{
            dizi[indis]=0;
            indis--;
            System.out.println("Data poped.");
        }
    }
    boolean isFull(){
        return indis==size-1;
    }
    boolean isEmpty(){
        return indis==-1;
    }
    void list(){
        for(int i=0;i<=indis;i++){
            System.out.print(dizi[i] + " ");
        }
    }
}

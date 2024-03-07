package HashTable;

public class Table {
    Node array [];
    int size;
    public Table(int size){
        this.size=size;
        array = new Node [size];
        for(int i=0;i<size;i++){
            array[i] = new Node();
        }
    }
    int setİndex(int key){
        return key%size;
    }
    void add(int key, String isim){
        Node eleman = new Node(key,isim);
        Node temp = array[setİndex(key)];
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=eleman;
        System.out.println(eleman.isim + " Added.");
    }
    void delete(int key){
        int index = setİndex(key);
        Node temp1 = array[index];
        while(temp1.next!=null){
            if(temp1.next.key==key){
                break;
            }
            temp1=temp1.next;
        }
        if(temp1.next==null){
                System.out.println(key + " not found.");
        }
        else{
            Node temp2 = temp1.next;
            temp1.next=temp1.next.next;
            System.out.println(temp2.isim + " is deleted.");
            temp2=null;
        }
    }
    void seeTable(){
        Node temp;
        for(int i=0;i<size;i++){
            temp=array[i];
            System.out.print(i + " - ");
            while(temp.next!=null){
                temp=temp.next;
                System.out.print(temp.isim + ", ");
            }
            System.out.print("\n");
        }
    }
}

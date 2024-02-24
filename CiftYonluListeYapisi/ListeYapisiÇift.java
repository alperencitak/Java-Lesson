package CiftYonluListeYapisi;

public class ListeYapisiÇift {
    Node1 head = null;
    Node1 tail = null;
    
    void sonaEkle(int data){
        Node1 eleman = new Node1(data);
        if(head==null){
            head = eleman;
            tail = eleman;
        }
        else{
            tail.next = eleman;
            eleman.before = tail;
            tail = eleman;
        }
    }
    void basaEkle(int data){
        Node1 eleman = new Node1(data);
        if(head==null){
            head = eleman;
            tail = eleman;
        }
        else{
            eleman.next = head;
            head.before = eleman;
            head = eleman;
        }
    }
    void arayaEkle(int data, int index){
        Node1 eleman = new Node1(data);
        int i=1;
        Node1 temp = head;
        Node1 temp2 = null;
        while(i<index){
            temp = temp.next;
            i++;
            if(temp.next==null){
                break;
            }
        }
        if(head==null){
            head = eleman;
            tail = eleman;
        }
        else if(head!=null&&index==0){
            eleman.next = head;
            head.before = eleman;
            head = eleman;
        }
        else if(temp.next==null){
            tail.next = eleman;
            eleman.before = tail;
            tail = eleman;
        }
        else{
            temp2 = temp.next;
            temp.next = eleman;
            eleman.before = temp;
            eleman.next = temp2;
            temp2.before = eleman;
        }
    }
    void bastanSil(){
        if(head==null){
            System.out.println("Listede silincek bir eleman yoktur.");
        }
        else if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            head = head.next;
            head.before = null;
        }
    }
    void sondanSil(){
        if(head==null){
            System.out.println("Listede silincek bir eleman yoktur.");
        }
        else{
            tail = tail.before;
            tail.next = null;
        }
    }
    void aradanSil(int index){
        int i=1;
        Node1 temp = head;
        while(i<index){
            temp = temp.next;
            i++;
            if(temp.next==null){
                break;
            }
        }
        if(head==null){
            System.out.println("Listede silincek bir eleman yoktur.");
        }
        else if(temp.next==null){
            tail = tail.before;
            tail.next = null;
        }
        else if(index==0){
            head=head.next;
            head.before=null;
        }
        else{
            temp.next = temp.next.next;
            temp.next.before = temp;
        }
    }
    void bastanYazdir(){
        Node1 temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print(" <--> ");
            }
            else{
                System.out.print("\n\n");
            }
            temp = temp.next;
        }
    }
    void sondanYazdir(){
        Node1 temp = tail;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.before!=null){
                System.out.print(" <--> ");
            }
            else{
                System.out.print("\n\n");
            }
            temp = temp.before;
        }
    }
}

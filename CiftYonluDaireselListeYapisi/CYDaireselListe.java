package CiftYonluDaireselListeYapisi;

public class CYDaireselListe {
    Node3 head = null;
    Node3 tail = null;
    void basaEkle(int data){
        Node3 eleman = new Node3(data);
        if(head==null){
            head = eleman;
            tail = eleman;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        }
        else{
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            tail.next = head;
            head.prev = tail;
        }
    }
    void sonaEkle(int data){
        Node3 eleman = new Node3(data);
        if(head==null){
            head = eleman;
            tail = eleman;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        }
        else{
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
            head.prev = tail;
            tail.next = head;
        }
    }
    void arayaEkle(int data, int index){
        Node3 eleman = new Node3(data);
        Node3 temp = head;
        int i=1,kontrol=0;
        while(i<index){
            temp = temp.next;
            if(temp.next==head){
                kontrol=1;
                break;
            }
            i++;
        }
        Node3 temp2=temp.next;
        if(head==null){
            head = eleman;
            tail = eleman;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        }
        else if(index==0){
            head.prev = eleman;
            eleman.next = head;
            head = eleman;
            tail.next = head;
            head.prev= tail;
        }
        else if(kontrol==1){
            tail.next=eleman;
            eleman.prev=tail;
            tail = eleman;
            tail.next = head;
            head.prev=tail;
        }
        else{
            temp.next= eleman;
            eleman.prev= temp;
            eleman.next=temp2;
            temp2.prev=eleman;
        }
    }
    void bastanSil(){
        if(head==null){
            System.out.print("Listede silinecek eleman yok.");
        }
        else if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head = head.next;
            tail.next=head;
            head.prev=tail;
        }
    }
    void sondanSil(){
        if(head==null){
            System.out.print("Listede silinecek eleman yok.");
        }
        else if(head==tail){
            head=null;
            tail=null;
        }
        else{
            tail = tail.prev;
            tail.next=head;
            head.prev=tail;
        }
    }
    void aradanSil(int index){
        Node3 temp = head;
        int i=0,n=0;
        while(temp.next!=head){
            temp=temp.next;
            n++;
        }
        if(head==null){
            System.out.print("Listede silinecek eleman yok.");
        }
        else if(head==tail){
            head=null;
            tail=null;
        }
        else if(index==0){
            head = head.next;
            head.prev=tail;
            tail.next=head;
        }
        else if(index >= n){
            tail = tail.prev;
            tail.next=head;
            head.prev=tail;
        }
        else{
            temp=head;
            i=0;
            while(i<index){
                temp=temp.next;
                i++;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
    }
    void yazdir(){
        Node3 temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp!=head);
        System.out.print(temp.data + " ...\n\n");
    }
}

package TekYonluDaireselListeYapisi;

public class DaireselListeYapisi {
    Node2 head = null;
    Node2 tail = null;
    void basaEkle(int data){
        Node2 eleman = new Node2(data);
        if(head==null){
            head = eleman;
            tail = eleman;
            tail.next = head;
        }
        else{
            eleman.next = head;
            head = eleman;
            tail.next = head;
        }
    }
    void sonaEkle(int data){
        Node2 eleman = new Node2(data);
        if(head==null){
            head = eleman;
            tail = eleman;
            tail.next = head;
        }
        else{
            tail.next = eleman;
            tail = eleman;
            tail.next = head;
        }
    }
    void bastanSil(){
        if(head==null){
            System.out.print("Silincek eleman yok.");
        }
        else if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            head = head.next;
            tail.next = head;
        }
    }
    void sondanSil(){
        if(head==null){
            System.out.print("Silincek eleman yok.");
        }
        else if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            Node2 temp = head;
            while(temp.next!=tail){
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
        }
    }
    void yazdir(){
        Node2 temp = head;
        for(int i=0;i<2;i++){
            do{
                System.out.print( temp.data + " ");
                temp = temp.next;
            }while(temp!=head);
        }
        System.out.print(" ...\n\n");
    }
}

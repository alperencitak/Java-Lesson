public class ListeYapisi {
    Node head = null;
    Node tail = null;
    
    void sonaEkle(int x){
        Node eleman = new Node();
        eleman.data = x;
        eleman.next = null;
        
        if (head==null){
            head = eleman;
            tail = eleman;
            System.out.println("Eleman listesi olmadığından oluşturulmuştur.");
        }
        else{
            tail.next = eleman;
            tail = eleman;
            System.out.println("Listede sona eleman eklendi.");
        }
    }
    void basaEkle(int x){
        Node eleman = new Node();
        eleman.data = x;
        if(head==null){
            head = eleman;
            tail = eleman;
            System.out.println("Eleman listesi olmadığından oluşturulmuştur.");
        }
        else{
            eleman.next = head;
            head = eleman;
            System.out.println("Listede başa eleman eklendi.");
        }
    }
    void arayaEkle(int x,int index){
        Node eleman = new Node();
        eleman.data = x;
        Node kontrol = head;
        int j = 0;
        while(kontrol!=null){
            kontrol = kontrol.next;
            j++;
        }
        if(head==null){
            head = eleman;
            tail = eleman;
            System.out.println("Eleman listesi olmadığından oluşturulmuştur.");
        }
        else if(head!=null && index==0){
            eleman.next = head;
            head = eleman;
        }
        else if(index>j){
            tail.next = eleman;
            tail = eleman;
            System.out.println("Yüksek bir değer girdiğiniz için eleman liste sonuna eklendi.");
        }
        else{
            int i=1;
            Node temp = head;
            while(i<index){
                temp = temp.next;
                i++;
            }
            eleman.next = temp.next;
            temp.next = eleman;
            System.out.println("Listede araya eleman eklendi.");
        }
    }
    void bastanSil(){
        if(head==null){
            System.out.println("Listede hiç eleman yoktur.");
        }
        else if(head!=null && head.next==null){
            head = null;
            tail = null;
            System.out.println("Listede kalan son eleman silindi.");
        }
        else{
            head = head.next;
            System.out.println("Listede baştan eleman silindi.");
        }
    }
    void sondanSil(){
        if(head==null){
            System.out.println("Listede hiç eleman yoktur.");
        }
        else if(head!=null && head.next==null){
            head = null;
            tail = null;
            System.out.println("Listede kalan son eleman silindi.");
        }
        else{
            Node temp = head;
             while(temp.next!=tail){
                 temp = temp.next;
             }
             tail = temp;
             tail.next = null;
             System.out.println("Listede sondan eleman silindi.");
        }
    }
    void aradanSil(int index){
        Node kontrol = head;
        int j = 0;
        while(kontrol!=null){
            kontrol = kontrol.next;
            j++;
        }
        if(head==null){
            System.out.println("Listede hiç eleman yoktur.");
        }
        else if(head!=null && head.next==null){
            head = null;
            tail = null;
            System.out.println("Listede kalan son eleman silindi.");
        }
        else if(index==0){
            head = head.next;
            System.out.println("Listede bastan eleman silindi.");
        }
        else if(index>j){
            System.out.println("Girdiğiniz indexde bir eleman bulunmamaktadır.");
        }
        else{
            int i = 1;
            Node temp1 = head;
            while(i<index){
                temp1 = temp1.next;
                i++;
            }
           Node temp2 = temp1.next;
           temp1.next = temp2.next;
           temp2 = null;
           System.out.println("Listede aradan eleman silindi.");
        }
    }
    void yazdir(){
        Node temp = new Node();
        temp = head;
        System.out.print("bas -> ");
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("son.\n\n");
    }
}

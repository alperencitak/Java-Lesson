package HashTable;

public class main {
    public static void main(String[] args){
        Table table = new Table(5);
        
        table.add(0,"Ahmet");
        table.add(10,"Mehmet");
        
        table.add(3,"Hüseyin");
        table.add(4,"Hasan");
        
        table.add(2,"Ayşe");
        table.add(22,"Fatma");
        
        table.add(15,"Beyza");
        table.add(9,"Ece");
        
        table.delete(10);
        table.delete(12);
        
        table.seeTable();
    }
}

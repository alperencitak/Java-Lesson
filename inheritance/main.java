package inheritance;

public class main {
   public static void main(String[] args){
       Customer cust = new Customer();
       cust.id=5;
       cust.age=24;
       cust.fName="Ahmet";
       cust.lName="Yılmaz";
       
       cust.seeFeatures();
   }
}

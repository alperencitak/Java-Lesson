package ArrayListWithClass;

public class Customer {

    int id;
    String firstName;
    String lastName;
    
    public Customer() {
        this.id = 0;
        this.firstName = "-";
        this.lastName = "-";
    }
    
    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public final void seeCustomer(){
        System.out.println(this.id + " " + this.firstName + " " + this.lastName);
    }
}

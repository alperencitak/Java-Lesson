package ArrayListWithClass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(5,"Ahmet","Yilmaz"));
        customers.add(new Customer(19,"Engin","Demir"));
        customers.add(new Customer(5,"Ayse","Coskun"));
        for(Customer cust:customers){
            cust.seeCustomer();
        }
    }

}

package generics;

public class Main {

    public static void main(String[] args) {
        MyList<String> citys = new MyList<String>();
        citys.add("Ankara");
        MyList<Customer> customers = new MyList<Customer>();
        customers.add(new Customer());
        customers.add(new Customer());
    }

}

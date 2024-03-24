package repositoryDemo;

public class Main {

    public static void main(String[] args) {
        Validator valid = new Validator();
        Customer cust = new Customer();
        valid.validate(cust);
    }

}

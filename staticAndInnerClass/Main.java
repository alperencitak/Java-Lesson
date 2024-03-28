package staticAndInnerClass;

public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product(3,"phone",6000);
        manager.add(product);
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createC();
    }

}

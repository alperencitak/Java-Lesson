package classesWithAtributes;

public class main {
    public static void main(String[] args){
        Product product = new Product(5);
        System.out.println("Age = " + product.getOld());
        product.setId(56);
        System.out.println("Id = " + product.getId());
    }
}

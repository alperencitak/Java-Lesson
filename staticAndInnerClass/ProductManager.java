package staticAndInnerClass;

public class ProductManager {
    public void add(Product product){
        if(ProductValidator.isValid(product)){
            System.out.println("Added");
        }
        else{
            System.out.println(" - ");
        }
        ProductValidator.AnotherClass.test();
    }
}

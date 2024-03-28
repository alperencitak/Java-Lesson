package staticAndInnerClass;

public class ProductValidator {
    static{
        System.out.println("Static Constractor");
    }
    static{
        System.out.println("2.Static Constractor");
    }
    public ProductValidator(){
        System.out.println("Normal Constractor");
    }
    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static class AnotherClass{ //inner classlarda static tanımlama kullanılabilir.
        public static void test(){
            System.out.println("TEST");
        }
    }
}

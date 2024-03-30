package exceptionHandling;

public class Main {

    public static void main(String[] args) {
        try{
            int[] array = new int[]{1,2,3};
            System.out.println(array[5]);
        }catch(StringIndexOutOfBoundsException exception){
            System.out.println("Error1 -> " + exception);
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Error2 -> " + exception);
        }catch(Exception exception){
            System.out.println("Error3 -> " + exception);
        }finally{
            System.out.println("I always work.");
        }
    }

}

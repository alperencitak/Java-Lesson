
package interface_demo;

public class Worker implements IWorkable, IEtable, IPayable{
    @Override
    public void work(){
        System.out.println("Worker working");
    }
    public void eat(){
        System.out.println("Worker eating");
    }
    public void pay(){
        System.out.println("Worker paying");
    }
}

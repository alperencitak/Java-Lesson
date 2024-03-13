package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add(){
        System.out.println("Data added: MySql");
    }
    public void rep(){
        System.out.println("Reposit: MySql");
    }
}

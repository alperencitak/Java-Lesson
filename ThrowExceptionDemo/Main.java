package ThrowExceptionDemo;

public class Main {

    public static void main(String[] args) {
        AccountManager account = new AccountManager();
        System.out.println(account.getBalance());
        account.deposit(50);
        System.out.println(account.getBalance());
        try{
            account.withdraw(90);
        }
        catch(BalanceInsufficentException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(account.getBalance());
    }

}

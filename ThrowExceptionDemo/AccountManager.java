package ThrowExceptionDemo;

public class AccountManager {

    double balance;

    public AccountManager() {
        this.balance = 0;
    }

    public AccountManager(double balance) {
        this.balance=getBalance()+balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }
    public void withdraw(double balance) throws BalanceInsufficentException {
        if(balance<=this.balance){
            this.balance=getBalance()-balance;
        }
        else{
            throw new BalanceInsufficentException("Balance Insufficent");
        }
    }
    public double getBalance() {
        return this.balance;
    }
}

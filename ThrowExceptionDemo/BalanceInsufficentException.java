package ThrowExceptionDemo;

public class BalanceInsufficentException extends Exception{
    String message;
    public BalanceInsufficentException(String message){
        this.message=message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}

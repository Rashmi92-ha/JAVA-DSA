package ExceptionHandling;

class lowBalanceException extends Exception{
    public lowBalanceException(String message){
        super(message);
    }
}
public class CustomExceptions {
    static void checkbalance(double balance) throws lowBalanceException{
        if(balance< 500){
            throw new lowBalanceException("minimum balance should be 500");
        }
    }
    public static void main(String[] args){
        try {
            checkbalance(300);
        }catch (lowBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}

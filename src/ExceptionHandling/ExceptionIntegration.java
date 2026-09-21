package ExceptionHandling;

class lowBalanceException1 extends Exception{
    public lowBalanceException1(String message){
        super(message);
    }
}
public class ExceptionIntegration {
    static void checkBalance(double balance) throws lowBalanceException1{
        if(balance < 500){
            throw new lowBalanceException1("Minimum balance 500");
        }
    }
    public static void main(String[] args){
        try {
            int x = 10/2;

            checkBalance(300);

        }catch (ArithmeticException e){
            System.out.println("MathError: " + e.getMessage());
        }
        catch (lowBalanceException1 e){
            System.out.println("Bank error: " + e.getMessage());
        }finally {
            System.out.println("Session closed");
        }
    }
}

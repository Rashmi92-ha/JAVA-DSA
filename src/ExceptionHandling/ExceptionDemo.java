package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args){
        try{
        int result = 10/0;
        System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by Zero");
        }finally{
            System.out.println("Finally Executed");
        }
        System.out.println("Program continues .......");
    }
}

package ExceptionHandling;

public class ArthmeticException {
    public static void main(String[] args){
        int[] array = {1,4,5,6,7};
        try{
            System.out.println(array[8]);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic error");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array error");
        }
        System.out.println("Program continues....");
    }
}

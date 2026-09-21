package ExceptionHandling;

public class AgeValidation {
    static void checkage(int age) throws Exception{
        if(age < 18){
            throw new Exception("Age must be 18 or above");
        }
        System.out.println("Eligible");
    }
    public static void main(String[] args){
        try{
            checkage(15);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

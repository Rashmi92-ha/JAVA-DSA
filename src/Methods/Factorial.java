package Methods;

public class Factorial {
    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n* factorial(n-1);
    }
    public static void main(String[] args){
        int factNumber = factorial(5);
        System.out.println(factNumber);
    }
}

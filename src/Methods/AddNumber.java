package Methods;
import java.util.Scanner;
public class AddNumber {
    static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a= sc.nextInt();
        System.out.print("Enter the number b: ");
        int b= sc.nextInt();
        int result = add(a, b);
        System.out.println("Total: " + result);
    }
}

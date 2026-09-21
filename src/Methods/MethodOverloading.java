package Methods;
import java.util.Scanner;
public class MethodOverloading {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b , int c){
        return a*b+c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();
        System.out.print("Enter the number b: ");
        int b = sc.nextInt();
        System.out.print("Enter the number c: ");
        int c = sc.nextInt();

        int result1 = add(a,b);
        int result2 = add(a,b,c);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        sc.close();
    }
}

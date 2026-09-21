import java.util.Scanner;
public class Reversetriangle {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Enter Starting number");
    int num = sc.nextInt();
    for(int i = 1 ; i<=n ; i++) {
        for(int j=1; j<= n-i; j++){
            System.out.print(num-- + " ");
        }
        System.out.println();
    }
    }
}

import java.util.Scanner;

public class Switchoperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.println("Enter the number 1");
        int num1= sc.nextInt();

        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Addition: " + (num1+num2));
                break;

            case 2:
                if(num2 != 0) {
                    System.out.println("Subtraction: " + (num1 - num2));
                }else{
                    System.out.println("Cannot divide by zero");
                }
                break;

            case 3:
                System.out.println("Multiplication: " + (num1*num2));
                break;

            case 4:
                System.out.println("Division: " + (num1/num2));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
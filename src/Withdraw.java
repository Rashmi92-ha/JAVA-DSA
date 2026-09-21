import java.util.Scanner;

public class Withdraw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1456;
        int balance = 20000;

        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {

            System.out.println("Login Successful");
            System.out.println();

            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");

            System.out.print("Choose Option: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Available Balance = ₹" + balance);

            } else if (choice == 2) {

                System.out.print("Enter Amount: ");
                int amount = sc.nextInt();

                if (amount <= balance) {

                    balance = balance - amount;

                    System.out.println("Please collect your cash.");
                    System.out.println("Remaining Balance = ₹" + balance);

                } else {

                    System.out.println("Insufficient Balance");

                }

            } else {

                System.out.println("Invalid Option");

            }

        } else {

            System.out.println("Invalid PIN");

        }

        sc.close();
    }
}

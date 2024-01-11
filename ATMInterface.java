import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 100000;
        while (true) {
            System.out.println("Welcome to the ATM interface.");
            System.out.println("1. Withdraw money");
            System.out.println("2. Deposit money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    if (balance >= withdrawAmount) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    balance += depositAmount;
                    System.out.println("Deposit successful.");
                    break;
                case 3:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}

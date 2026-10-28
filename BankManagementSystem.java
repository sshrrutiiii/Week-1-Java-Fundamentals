
import java.util.Scanner;

public class BankManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        int choice = 0;

        do {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Validate menu input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.printf(
                            "Current Balance: Rs. %.2f%n", balance
                    );
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");

                    if (!sc.hasNextDouble()) {
                        System.out.println("Invalid amount!");
                        sc.next();
                        break;
                    }

                    double deposit = sc.nextDouble();

                    if (deposit <= 0) {
                        System.out.println(
                                "Deposit amount must be greater than zero."
                        );
                    } else {
                        balance += deposit;
                        System.out.printf(
                                "Deposit successful! Balance: Rs. %.2f%n",
                                balance
                        );
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");

                    if (!sc.hasNextDouble()) {
                        System.out.println("Invalid amount!");
                        sc.next();
                        break;
                    }

                    double withdrawal = sc.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println(
                                "Withdrawal amount must be greater than zero."
                        );
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdrawal;
                        System.out.printf(
                                "Withdrawal successful! Balance: Rs. %.2f%n",
                                balance
                        );
                    }
                    break;

                case 4:
                    System.out.println(
                            "Thank you for using our Bank Management System!"
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid choice! Please select 1, 2, 3 or 4."
                    );
            }

        } while (choice != 4);

        sc.close();
    }
}

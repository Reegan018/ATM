import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234, balance = 1000;

        System.out.print("Enter PIN: ");
        if (sc.nextInt() != pin) {
            System.out.println("Incorrect PIN!");
            return;
        }

        while (true) {
            System.out.println("\n1. Withdraw 2. Deposit 3. Balance 4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: 
			System.out.print("Amount: ");
                        int w = sc.nextInt();
                        if (w <= balance) balance -= w;
                        else System.out.println("Insufficient balance!");
                        break;
                case 2: 
			System.out.print("Amount: ");
                        balance += sc.nextInt(); 
			break;
                case 3: 
			System.out.println("Balance: " + balance); 
			break;
                case 4: 
			return;
            }
        }
    }
}

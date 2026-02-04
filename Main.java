import java.io.FileNotFoundException;
import java.io.FileReader;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance = 5000.0;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining Balance: " + balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        }

        try {
            account.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }

        try {
            FileReader reader = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception caught: File not found!");
        }

        System.out.println("Transaction Completed.");
    }
}
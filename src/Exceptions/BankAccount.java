package Exceptions;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException(amount, balance);
        }

        balance -= amount;
        System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);

        try {
            account.withdraw(200.00);   // succeeds
            account.withdraw(400.00);   // fails, there was only 300 left
        } catch(InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
            System.out.println("Shortfall: $" + (e.getAmount() - e.getBalance()));
        }
    }
}

class InsufficientFundsException extends Exception {
    private double amount;
    private double balance;

    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException(double amount, double balance) {
        super(String.format(
            "Tried to withdraw %.2f but balance is only %.2f",
            amount, balance)
        );

        this.amount = amount;
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}

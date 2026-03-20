package Exceptions.Practice;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }

        this.balance = balance;
    }

    public void deposit(double amount) {
        // TODO: throw IllegalArgumentException if amount <= 0

        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        // TODO: throw IllegalArgumentException if amount <=0 
        // TODO: throw InsufficientFundsException if amount > balance
        //               shortfall = amount - balance

        balance -= amount;
    }

    public double getBalance() { return balance; }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);

        try {
            account.deposit(50.0);
            account.withdraw(200.0);    // should trigger InsufficientFundsExcaption
        } catch(InsufficientFundsException e) {
            // TODO: print e.getMessage() and e.getShortfall()
        } catch(IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}

package exceptions;
public class UncheckedCustomException {
    private double balance;

    public void deposit(double amount) {
        // Validate input state
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero. Provided: " + amount);
        }
        this.balance += amount;
    }

    public static void main(String[] args) {
    	UncheckedCustomException account = new UncheckedCustomException();
        try {
            account.deposit(-50);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid operation: " + e.getMessage());
        }
    }
}
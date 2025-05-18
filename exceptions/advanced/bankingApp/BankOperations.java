package exceptions.advanced.bankingApp;

public class BankOperations {
	private float balance;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void withdraw(int amount) throws InsufficientBalance {
		if(this.balance < amount ) throw new InsufficientBalance("Insufficent Balance");
		if(amount < 0) System.out.println("Amount must be greater than 0");
		this.balance -= amount;
	}
	public void deposit(int amount) {
		if(amount < 0) System.out.println("Amount must be greater than 0");
		this.balance += amount;
	}
}

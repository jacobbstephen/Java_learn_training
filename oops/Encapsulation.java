package oops;

class BankAccount{
	private double balance;
	
	public BankAccount(double initialBalance) {
		
		if(initialBalance < 0) {
			System.out.println("Initial Balance Cannot be Zero!!");
			balance = 0;
		}else balance = initialBalance;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Balance amount after deposit: " + balance);
		}
		else {
			System.out.println("Amount to be deposited must be greater than 0");
		}
	}
	
	public void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Amount to be deposited must be greater than 0");
		} else if(amount > balance) {
			System.out.println("Insufficent Balance");
		}else {
			balance -= amount;
			System.out.println("Balance amount after withdrawl: " + balance);
		}
	}
}

public class Encapsulation {
	public static void main(String args[]) {
		BankAccount account = new BankAccount(1000);
		System.out.println("Balance: " + account.getBalance());
		account.deposit(1000);
		account.withdraw(500);
	}
}

package exceptions.advanced.bankingApp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOperations bank = new BankOperations();
		bank.setBalance(500);
		System.out.println("The balance is: " + bank.getBalance());
		bank.deposit(500);
		System.out.println("The balance after depositing is: " + bank.getBalance());
		try {
			bank.withdraw(1001);
			System.out.println("The balance after withdrawing is: " + bank.getBalance());
		}catch(InsufficientBalance e) {
			System.out.println("The balance is: " + bank.getBalance());
			System.out.println(e);
		}

	}

}

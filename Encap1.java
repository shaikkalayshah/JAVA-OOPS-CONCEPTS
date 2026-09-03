package oops.com;

class Encap1 {

	// Private fields - Encapsulation
	private long accountNumber;
	private String holderName;
	private double balance;

	Encap1(long accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = 5000;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited: ₹" + amount);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn: ₹" + amount);
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {

		Encap1 account = new Encap1(123456789, "Shaik");

		System.out.println("Initial Balance: ₹" + account.getBalance());

		account.deposit(2000);
		account.withdraw(1500);

		System.out.println("Final Balance: ₹" + account.getBalance());
	}
}
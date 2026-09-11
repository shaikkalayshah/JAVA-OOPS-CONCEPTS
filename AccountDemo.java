package oops.com;

abstract class Account {

	static void bankName() {
		System.out.println("Bank Name: V CUBE Bank");
	}

	void accountType() {
		System.out.println("Account Type: General Account");
	}

	abstract void calculateInterest();
}

class SavingsAccount extends Account {

	@Override
	void calculateInterest() {
		System.out.println("Savings Account Interest: 5%");
	}
}

class CurrentAccount extends Account {

	@Override
	void calculateInterest() {
		System.out.println("Current Account Interest: 3%");
	}
}

public class AccountDemo {

	public static void main(String[] args) {

		Account.bankName();
		System.out.println();
		SavingsAccount savings = new SavingsAccount();
		savings.accountType();
		savings.calculateInterest();
		System.out.println();

		CurrentAccount current = new CurrentAccount();

		current.accountType();
		current.calculateInterest();
	}
}
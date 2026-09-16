package oops.com;

abstract class Payment {
	double amount;
	double transactionFee;

	abstract void pay(double amount);

	void displayPaymentDetails() {
		double totalAmount = amount + transactionFee;
		System.out.println("Amount : " + amount);
		System.out.println("Transaction Fee : " + transactionFee);
		System.out.println("Total Amount to be paid : " + totalAmount);
		System.out.println("Payment successfull !!!");
		System.out.println();
	}
}

class CreditCard extends Payment {

	@Override
	void pay(double amount) {
		this.amount = amount;
		transactionFee = amount * 0.02;
		System.out.println("Payment Method : Credit Card");
		displayPaymentDetails();
		System.out.println("---------------------------------------------");
	}

}

class UPI extends Payment {

	@Override
	void pay(double amount) {
		this.amount = amount;
		transactionFee = 0;
		System.out.println("Payment Method : UPI");
		displayPaymentDetails();
		System.out.println("---------------------------------------------");

	}

}

class NetBanking extends Payment {

	@Override
	void pay(double amount) {
		this.amount = amount;
		transactionFee = 10;
		System.out.println("Payment Method : Net Banking");
		displayPaymentDetails();
		System.out.println("---------------------------------------------");

	}

}

public class PaymentDemo {

	public static void main(String[] args) {
		Payment creditCard = new CreditCard();
		Payment upi = new UPI();
		Payment netBanking = new NetBanking();

		creditCard.pay(5000);
		upi.pay(5000);
		netBanking.pay(5000);

	}

}

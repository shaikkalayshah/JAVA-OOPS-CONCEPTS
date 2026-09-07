package oops.com;

class OrderDetails {
	int orderId;
	String customerName;
	double price;

	public OrderDetails(int orderId, String customerName, double price) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.price = price;
	}

	void displayDetails() {
		System.out.println("-----Orde Details----- ");
		System.out.println("Orde ID: " + orderId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Price: " + price);
	}

	void prepareFood() {
		System.out.println("Prepareing food...");
	}
}

class PizzaOrder extends OrderDetails {

	public PizzaOrder(int orderId, String customerName, double price) {
		super(orderId, customerName, price);
	}

	@Override
	void prepareFood() {
		System.out.println("Preparing Pizza...");
	}
}

class BurgerOrder extends OrderDetails {

	public BurgerOrder(int orderId, String customerName, double price) {
		super(orderId, customerName, price);
	}

	@Override
	void prepareFood() {
		System.out.println("Preparing burger...");
	}
}

public class FoodOrder {

	public static void main(String[] args) {
		OrderDetails order;

		order = new PizzaOrder(101, "Bittu", 299);
		order.prepareFood();
		order.displayDetails();

		System.out.println("---------------------------------------");

		order = new BurgerOrder(145, "Farhana", 199);
		order.prepareFood();
		order.displayDetails();

		System.out.println("---------------------------------------");

		order = new BurgerOrder(149, "Alia", 159);
		order.prepareFood();
		order.displayDetails();

	}

}

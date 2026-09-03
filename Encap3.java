<<<<<<< HEAD
package oops.com;

class Encap3 {

	private int cartItems;
	private double totalAmount;

	Encap3() {
		cartItems = 0;
		totalAmount = 0;
	}

	void addItem(double price) {
		cartItems++;
		totalAmount = totalAmount + price;
	}

	void removeItem(double price) {
		if (cartItems > 0) {
			cartItems--;
			totalAmount = totalAmount - price;
		}
	}

	double getTotal() {
		return totalAmount;
	}

	public static void main(String[] args) {

		Encap3 cart = new Encap3();

		cart.addItem(50000);
		cart.addItem(1000);
		cart.addItem(2000);

		cart.removeItem(1000);

		System.out.println("Number of Items: " + cart.cartItems);
		System.out.println("Total Amount: ₹" + cart.getTotal());
	}
=======
package oops.com;

class Encap3 {

	private int cartItems;
	private double totalAmount;

	Encap3() {
		cartItems = 0;
		totalAmount = 0;
	}

	void addItem(double price) {
		cartItems++;
		totalAmount = totalAmount + price;
	}

	void removeItem(double price) {
		if (cartItems > 0) {
			cartItems--;
			totalAmount = totalAmount - price;
		}
	}

	double getTotal() {
		return totalAmount;
	}

	public static void main(String[] args) {

		Encap3 cart = new Encap3();

		cart.addItem(50000);
		cart.addItem(1000);
		cart.addItem(2000);

		cart.removeItem(1000);

		System.out.println("Number of Items: " + cart.cartItems);
		System.out.println("Total Amount: ₹" + cart.getTotal());
	}
>>>>>>> branch 'main' of https://github.com/shaikkalayshah/JAVA-OOPS-CONCEPTS.git
}
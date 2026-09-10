package oops.com;

class Product {
	int productID;
	String productName;
	double price;

	public Product(int productID, String productName, double price) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}

	void displayproductDetalis() {
		System.out.println("Product ID: " + productID);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + price);
	}

	double calculateDiscount() {
		return 0;
	}
}

class Electronics extends Product {
	String brand;

	public Electronics(int productID, String productName, double price, String brand) {
		super(productID, productName, price);
		this.brand = brand;
	}

	@Override
	void displayproductDetalis() {
		super.displayproductDetalis();
		System.out.println("Brand Name : " + brand);
	}

	@Override
	double calculateDiscount() {
		return price * 0.15;
	}
}

class Clothing extends Product {
	String brand;

	public Clothing(int productID, String productName, double price, String brand) {
		super(productID, productName, price);
		this.brand = brand;
	}

	@Override
	void displayproductDetalis() {
		super.displayproductDetalis();
		System.out.println("Brand Name : " + brand);
	}

	@Override
	double calculateDiscount() {
		return price * 0.10;
	}
}

class Furniture extends Product {
	String Material;

	public Furniture(int productID, String productName, double price, String Material) {
		super(productID, productName, price);
		this.Material = Material;
	}

	@Override
	void displayproductDetalis() {
		super.displayproductDetalis();
		System.out.println("Material Name : " + Material);
	}

	@Override
	double calculateDiscount() {
		return price * 0.12;
	}
}

class ProductDemo {

	public static void main(String[] args) {
		double discount;
		double finalPrice;
		Electronics e1 = new Electronics(101, "Laptop", 60000, "Dell");

		System.out.println("----- Electronics -----");
		e1.displayproductDetalis();

		discount = e1.calculateDiscount();
		finalPrice = e1.price - discount;

		System.out.println("Discount: " + discount);
		System.out.println("Final Price: " + finalPrice);

		Clothing c1 = new Clothing(102, "Shirt", 1000, "US polo");

		System.out.println("----- Clothing -----");
		c1.displayproductDetalis();

		discount = c1.calculateDiscount();
		finalPrice = c1.price - discount;

		System.out.println("Discount: " + discount);
		System.out.println("Final Price: " + finalPrice);

		Furniture f1 = new Furniture(103, "Table", 10000, "Wood");

		System.out.println("----- Furniture  -----");
		f1.displayproductDetalis();

		discount = f1.calculateDiscount();
		finalPrice = f1.price - discount;

		System.out.println("Discount: " + discount);
		System.out.println("Final Price: " + finalPrice);

	}
}
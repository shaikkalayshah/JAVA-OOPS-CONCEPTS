<<<<<<< HEAD
package oops.com;

class Encap2 {

	private int bookId;
	private String title;
	private String author;
	private double price;

	// Setters
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Getters
	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public static void main(String[] args) {

		Encap2 b = new Encap2();

		b.setBookId(101);
		b.setTitle("Java Programming");
		b.setAuthor("James Gosling");
		b.setPrice(599.50);

		System.out.println("Book ID: " + b.getBookId());
		System.out.println("Title: " + b.getTitle());
		System.out.println("Author: " + b.getAuthor());
		System.out.println("Price: " + b.getPrice());
	}
}
=======
package oops.com;

class Encap2 {

	private int bookId;
	private String title;
	private String author;
	private double price;

	// Setters
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Getters
	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public static void main(String[] args) {

		Encap2 b = new Encap2();

		b.setBookId(101);
		b.setTitle("Java Programming");
		b.setAuthor("James Gosling");
		b.setPrice(599.50);

		System.out.println("Book ID: " + b.getBookId());
		System.out.println("Title: " + b.getTitle());
		System.out.println("Author: " + b.getAuthor());
		System.out.println("Price: " + b.getPrice());
	}
}
>>>>>>> branch 'main' of https://github.com/shaikkalayshah/JAVA-OOPS-CONCEPTS.git

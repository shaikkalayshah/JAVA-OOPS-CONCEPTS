package oops.com;

abstract class Shape {
	abstract void area();
}

class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	void area() {
		double result = Math.PI * radius * radius;
		System.out.println("Area of Circle: " + result);
	}
}

class Rectangle extends Shape {
	double length;
	double breadth;

	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void area() {
		double result = length * breadth;
		System.out.println("Area of Rectangle: " + result);
	}
}

class Triangle extends Shape {
	double base;
	double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	void area() {
		double result = 0.5 * base * height;
		System.out.println("Area of Triangle: " + result);
	}
}

public class ShapeDemo {
	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(10, 5);
		Shape triangle = new Triangle(8, 6);
		circle.area();
		rectangle.area();
		triangle.area();
	}
}

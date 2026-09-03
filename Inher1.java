package oops.com;

class Vehicle {
	void start() {
		System.out.println("Vehicle is started");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Car is Driving");
	}
}

public class Inher1 {

	public static void main(String[] args) {
		Car car = new Car();

		car.start();
		car.drive();
	}

}

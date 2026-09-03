package oops.com;

class Vehicle1 {
	int speed = 50;
	void display() {
		System.out.println("Vehicle speed is: "+speed);
	}
}
class Car1 extends Vehicle1
{
		int speed =100;
		
		@Override
		void display() {
		System.out.println("Car speed is :"+speed);
	}
}
public class Inher3 {

	public static void main(String[] args) {
		Car1 car = new Car1();
		System.out.println(car.speed);
		car.display();

	}
	

}

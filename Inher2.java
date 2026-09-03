package oops.com;

class Person {

	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student extends Person {

	int studentID;
	String collegeName;

	Student(String name, int age, String collegeName, int studentID) {
		super(name, age);
		this.collegeName = collegeName;
		this.studentID = studentID;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("College: " + collegeName);
		System.out.println("Student ID: " + studentID);
	}
}

public class Inher2 {
	public static void main(String[] args) {

		Student student1 = new Student("Bittu", 21, "ABC College", 101);
		student1.display();
		System.out.println("---------------------------------------------");
		Student student2 = new Student("Farhana", 22, "XYZ College", 102);
		student2.display();
	}
}
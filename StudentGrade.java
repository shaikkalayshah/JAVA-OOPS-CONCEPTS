package oops.com;

import java.util.Scanner;

class Student1 {
	void calculateGrade(int marks) {
		System.out.println("Calculating Grade...");
	}
}

class EngineeringStudent extends Student1 {
	@Override
	void calculateGrade(int marks) {
		if (marks > 90) {
			System.out.println("Grade:A");
		} else if (marks >= 75) {
			System.out.println("Grade:B");
		} else if (marks >= 60) {
			System.out.println("Grade:C");
		} else if (marks >= 45) {
			System.out.println("Grade:D");
		} else {
			System.out.println("Fail!!!");
		}
	}
}

class MedicalStudent extends Student1 {
	@Override
	void calculateGrade(int marks) {
		if (marks > 90) {
			System.out.println("Excellent");
		} else if (marks >= 80) {
			System.out.println("Good");
		} else if (marks >= 65) {
			System.out.println("Average");
		} else if (marks >= 50) {
			System.out.println("Need to improve");
		} else {
			System.out.println("Fail!!!");
		}
	}
}

class ManagementStudent extends Student1 {
	@Override
	void calculateGrade(int marks) {
		if (marks > 90) {
			System.out.println("Grade:A");
		} else if (marks >= 75) {
			System.out.println("Grade:B");
		} else if (marks >= 60) {
			System.out.println("Grade:C");
		} else if (marks >= 45) {
			System.out.println("Grade:D");
		} else if (marks >= 36) {
			System.out.println("Grade:E");
		} else {
			System.out.println("Fail!!!");
		}
	}
}

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of the student : ");
		String name = sc.nextLine();

		System.out.println("\n1:Engineering Branch");
		System.out.println("\n2:Medical Branch");
		System.out.println("\n3:Management Branch");
		System.out.println("                       ");

		System.out.println("Enter the Branch : ");
		int branch = sc.nextInt();

		System.out.println("Enter the marks : ");
		int marks = sc.nextInt();

		Student1 s = new Student1();

		switch (branch) {
		case 1:
			s = new EngineeringStudent();
			System.out.println("-----Student Details-----");
			System.out.println("Student name : " + name);
			System.out.println("Student Type : Engineering Student");
			s.calculateGrade(marks);
			break;

		case 2:
			s = new MedicalStudent();
			System.out.println("-----Student Details-----");
			System.out.println("\nStudent name : " + name);
			System.out.println("\nStudent Type : Medical Student");
			s.calculateGrade(marks);
			break;

		case 3:
			s = new ManagementStudent();
			System.out.println("-----Student Details-----");
			System.out.println("\nStudent name : " + name);
			System.out.println("\nStudent Type : Management Student");
			s.calculateGrade(marks);
			break;

		default:
			System.out.println("Invalid Branch");

		}
		sc.close();
	}

}

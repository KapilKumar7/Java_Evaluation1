package question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Students you want to enter");
		int n = scanner.nextInt();

		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter detail of student" + (i + 1));
			System.out.println("Enter the Roll Number :");
			int rollNumber = scanner.nextInt();
			System.out.println("Enter the Name :");
			String studentName = scanner.next();
			System.out.println("Enter the marks :");
			int marks = scanner.nextInt();
			Student s1 = new Student(rollNumber, studentName, marks);
			students[i] = s1;

		}
		for (int i = 0; i < n; i++) {
			System.out.println("Student Roll Number: " + students[i].getRollNumber());
			System.out.println("Student Name: " + students[i].getStudentName());
			System.out.println("Student Mark: " + students[i].getMarks());
			System.out.println("======================================");
		}

	}

}

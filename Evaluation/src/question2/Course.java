package question2;

import java.util.Scanner;

public class Course {

	int courseId;
	String courseName;
	int courseFee;

	void displayCourseDetails() {
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(courseFee);
	}

	static void authenticate(String username, String password) {
		if (username == "Admin" && password == "1234") {
			Course c1 = new Course();
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER courseId: ");
			int courseId = sc.nextInt();
			c1.courseId = courseId;
			System.out.println("Enter courseName: ");
			String courseName = sc.next();
			c1.courseName = courseName;
			System.out.println("Enter courseFee: ");
			int courseFee = sc.nextInt();
			c1.courseFee = courseFee;
			c1.displayCourseDetails();

		} else
			System.out.println("Invalid Username or password");

	}

	public static void main(String[] args) {

		authenticate("Admin", "1234"); // valid credential
		authenticate("Admin", "9999"); // invalid credential
	}

}

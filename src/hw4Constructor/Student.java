package hw4Constructor;

public class Student {
	String studentName;// variable declared
	int studentID;
	char Gender;
	boolean ITStudent;
	float studentgrade;

	public Student() {// constructor declared//default constructor
		System.out.println(" This is all about Student");
	}

	public Student(String studentName, int studentId, char gender, boolean ITStudent, float studentgrade) {
		this.studentName = studentName;
		this.studentID = studentId;
		this.Gender = gender;
		this.ITStudent = ITStudent;
		this.studentgrade = studentgrade;
		System.out.println("Student name: " + studentName + ", Student Id: " + studentId + ", Student gender: " + Gender
				+ ", Java Programmer? " + ITStudent + ", Student grade: " + studentgrade);

	}
}

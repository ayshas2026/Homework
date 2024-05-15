package hw3JavaVariablesDeclared;


public class AboutMe {
	String myName;// variable declared
	String myAge;
	int rollNumber;
	float hight;
	char gender;
	boolean iAmStudent;
	byte classNumber;
	short dressPrice;
	long homeAge;
	double homePrice;

	public AboutMe() {// constructor declared
		System.out.println("    This is all about Myself      ");
	}

	public void aboutMe() {
		System.out.println("My age " + myAge + "\nMy roll number" + rollNumber + "\nMy hight" + hight + "\n My gender  "
		+ gender + "\nI am a student" + iAmStudent + "\nMy class number" + classNumber + "\nMy dress price"
		+ dressPrice + "\nMy home age" + homeAge + "\nMy home price" + homePrice);

	}

	public static void main(String[] args) {
		AboutMe aboutme = new AboutMe();// constructor initialized.
		aboutme.aboutMe(); 
		
	}
}



package hw2JavaVariablesInitialized;


public class AboutMe {
	String myName;// variable declared
	String myAge="23";// variable initialized
	int rollNumber=1;
	float hight=5.03f;
	char gender='F';
	boolean iAmStudent= true;
	

	public AboutMe() {// constructor declared
		System.out.println("    This is all about Myself      ");
	}

	public void aboutMe() {
		System.out.println("My age " + myAge + "\nMy roll number" + rollNumber + "\nMy hight" + hight + "\n My gender  "
				+ gender + "\nI am a student" + iAmStudent );

	}

	public static void main(String[] args) {
		AboutMe aboutme = new AboutMe();// constructor initialized.
		aboutme.aboutMe();
	}
}

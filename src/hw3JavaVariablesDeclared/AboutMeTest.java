package hw3JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aysha = new AboutMe();//constructor initialized.
		aysha.myName = " Aysha";// variable initialized.
		aysha.myAge = " 23";
		aysha.rollNumber = 1;
		aysha.hight = 5.03f;
		aysha.gender = 'F';
		aysha.iAmStudent = true;
		aysha.classNumber = 03;
		aysha.dressPrice = 800;
		aysha.homeAge = 100;
		aysha.homePrice = 450000000;
		aysha.aboutMe();//method initialized.

		System.out.println(".........Alex information.......");
		AboutMe alex = new AboutMe();
		alex.myName = " Alex";// variable initialized
		alex.myAge = " 25";
		alex.rollNumber = 2;
		alex.hight = 5.09f;
		alex.gender = 'M';
		alex.iAmStudent = false;
		alex.classNumber = 02;
		alex.dressPrice = 900;
		alex.homeAge = 150;
		alex.homePrice = 56000000;
		alex.aboutMe();
	}
}

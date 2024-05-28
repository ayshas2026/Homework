package hw5JavaMethods;

public class MyFamily {

	public int child1Age = 15;
	public int child2Age = 12;
	public int child3Age = 9;
	public int child4Age = 6;

	public int myFamily() {
		int sum = child1Age + child2Age + child3Age + child4Age;
		System.out.println("The sum of my childrens age is: " + sum);
		return sum;
	}

	public static void main(String[] args) {
		MyFamily bigFamily = new MyFamily();
		bigFamily.myFamily();
	}

}

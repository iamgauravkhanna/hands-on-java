package java.examples.variables;

public class LocalVariables2 {

	public void StudentAge() {

		// local variable age
		int age = 0;

		age = age + 5;
	}

	public static void main(String args[]) {

		// using local variable age outside it's scope
		//System.out.println("Student age is : " + age);
	}

}

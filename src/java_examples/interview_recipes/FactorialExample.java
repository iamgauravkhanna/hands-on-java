package java_examples.interview_recipes;

// Factorial of a number n is denoted as n! and the value of n! is: 1 * 2 * 3 * … (n-1) * n
class FactorialExample {

	public static void main(String args[]) {

		int i, fact = 1;

		int number = 2;// It is the number to calculate factorial

		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
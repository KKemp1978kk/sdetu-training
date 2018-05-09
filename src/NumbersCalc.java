
public class NumbersCalc {

	public static void main(String[] args) {
		
		System.out.println("Program is Starting...");
		// printName();
		int numA = 10;
		int numB = 30;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		// System.out.println("The product of numbers " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
	}
	
	static void printName() {
		System.out.println("My name is KEVIN...");
	}
	
	static void addNumbers(int numberA, int numberB) {
		// This function will add two numbers
		int sum = numberA + numberB;
		System.out.println("The sum of " + numberA + " plus The sum of " + numberB + " is " + sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		//addNumbers(product, product);
		return product;
	}
}

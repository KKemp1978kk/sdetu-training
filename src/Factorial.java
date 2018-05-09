
public class Factorial {

	public static void main(String[] args) {
		printFactorial(5);	
	}
	// Simple Loop to generate the factorial
	public static void printFactorial(int n) {
		int factorial = 1;
		for(int i = 1; i <= n; i--) {
			factorial = factorial * 1;
		}
		
		System.out.println(factorial);

	}
}

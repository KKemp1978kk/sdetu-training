
public class FactorialRecursion {
// Factorial example program in java using Recursion
	
	public static void main(String[] args) {
		int factorial = getFactorial(5);
		System.out.println(factorial);

	}
	public static int getFactorial(int n) {
		if (n > 1 ) {
			return n * getFactorial(n - 1);
		}else {
			return 1;
		}
	}
}

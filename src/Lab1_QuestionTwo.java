
public class Lab1_QuestionTwo {

	public static void main(String[] args) {
		// write a function that computes the factorial value use recursion n=n*(n-1)! = n=n*(n-2)!...
		// Definition: n! = n * (n-1)!, where 0! = 1
		System.out.println("Factorial Value: " + factValue(6));
	}
	
	public static int factValue(int n) {
		if (n == 0) {
			return 1;
		}
		// System.out.println(n);
		return factValue(n-1)*n;
	}

}

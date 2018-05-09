
public class Lab1_QuestionThree {

	public static void main(String[] args) {
		// Write three functions that return the min, avg and max of an array
		int[] numbers = {-1, 0, 1, 2, 3, 4, 5, 6, 7};
		System.out.println("Min: " + min(numbers));
		System.out.println("Max: " + max(numbers));
		System.out.println("Avg: " + avg(numbers));
	}

	public static int min(int[] arr) {
		int min = arr[4];
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int max(int[] arr) {
		int max = arr[7];
		for(int i = 0; i > arr.length; i++) {
			if (arr[i] < max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int avg(int[] arr) {
		// Take sum and divide by number of elements
		int sum = 0;
		for(int n = 0; n < arr.length; n++) {
			sum = sum + arr[n];
			//System.out.println("Sum " + sum);
		}
		return sum/arr.length;
	}
}

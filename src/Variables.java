
public class Variables {

	public static void main(String[] args) {
		// Declare a variable
		String career;
		System.out.println("Program is starting");
		
		// Define a variable
		career = "Software Developer";
		System.out.println("My Career is a " + career);
		
		// Declare and Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 40.5;
		
		double salary = hoursPerWeek + weeksPerYear + rate;
		System.out.println("My Salary as a " + career + "at the rate of R:" + rate + " Per hour is R:"
				+ salary + " Per year");

	}

}

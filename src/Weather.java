
public class Weather {

	public static void main(String[] args) {
		
		int temperature = 45;
		String sunConditions = "Sunny";
	
		 if (temperature > 80) {
				System.out.println("Its Cooler");
			}
		 
		 else if((temperature > 60) && (sunConditions == "OverCast")) {
				System.out.println("Its Cooler");
				System.out.println("Dont bring a hat");
		 }
		 
		 else if((temperature > 50) || (sunConditions == "Sunny")) {
				System.out.println("Its Cooler");
		 }
		 
		 else {
				System.out.println("Looks like a cold day");
			}
		System.out.println("Nothing to see today");
	}
}

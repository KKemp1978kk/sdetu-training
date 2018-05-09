package OOP;

public class Lab2_QuestionOne {

	public static void main(String[] args) {
		// New Student constructor that takes a name and SSN in the arguments
		Student student1 = new Student("Kevin", "19780523");
		Student student2 = new Student("Collin", "19820326");
		Student student3 = new Student("Michael", "19830130");
		
		student1.enroll("WoodWork");
		student1.enroll("Computer Science");
		student1.enroll("Biology");
		
		student1.showCourses();
		student1.checkBalance();
		student1.pay(300);
		student1.checkBalance();
		
		//System.out.println(student1.toString());
	}
}

class Student{
	private String userId;
	// Set a private static ID
	private static int iD = 10;
	private String Name;
	private String Ssn;
	public String Courses = "";
	private static final int cost = 5000;
	private int balance = 0;
	
	private String Email;
	private String Phone;
	private String City;
	private String State;
	
	public Student(String Name, String Ssn) {
		this.Name = Name;
		this.Ssn = Ssn;
		setUserId();
		setEmail();
		iD++;
	}
	
	// Use ENCAPSULATION to set variables(phone, city, state)
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getCity() {
		return City;	
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	public void setEmail() {
		Email = Name.toLowerCase() + "." + iD + "kempk@vodamail.com";
		System.out.println("Your Email " + Email);
	}
	
	// Generate a user ID that is combination of Static ID, 
	// Random 4-digit number between 1000 and 9000 and last 4 of SSN. 
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randomNr = (int) (Math.random() * ((max - min)));
		randomNr = randomNr + min;
		userId = iD + "" + Ssn.substring(5);
		System.out.println("User Id:  " + userId);
	}
	
	// Methods: enroll(), pay(), checkBalance(), toString(), showCourse()
	public void enroll(String Courses) {
		this.Courses = this.Courses + "\n" + Courses;
		balance = balance + cost;
	}
	
	public void pay(int amount) {
		System.out.println("Payment Amount; " + amount);
		balance = balance + amount;
	}
	
	public void checkBalance() {
		System.out.println("Balance: R " + balance);
	}
	
	public void showCourses() {
		System.out.println(Courses);
	}
	
	public String toString() {
		return "Name: " + Name + "\nCourses " + Courses + "\nBalance " + balance;
	}	
}
	
	


package OOP;

public class BankAccount implements IRate{
	// Define Variables
	String accountNumber;
	
	// static >> belongs to the CLASS not the object instance
	// final >> constant (often static final)
	static final String routingNumber = "012345";
	
	// Instance Variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor Definitions: Unique methods
	// 1. They are used to define / setup/ initialize properties of an object
	// 2. Constructors are IMPLICITLY called upon INSTANSIATION
	// 3. The same name as the class itself
	// 4. Constructors have no return type at all
	BankAccount() {
		System.out.println("New Account Created");
	}
	// Overloading: Call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("Account Created: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, message are all local Variables
		System.out.println("New Account " + accountType);
		System.out.println("Initial Deposit of: $" + initDeposit);
		String message = null;
		if(initDeposit < 1000) {
			 message = "ERROR: Minimum depostit must be $1000";	
		} else {
			 message = "Thank you for your deposit of: $" + initDeposit;
		}
		System.out.println(message);
		balance = initDeposit;
	}
	
	// Getters and Setters
	// Allow the user to define the name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name = "Mr." + name;
	}
	
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	// Defined Methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit:");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("Withdraw:");
	}
	
	// Private: can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("Your recent transaction " + activity);
		System.out.println("Your new balance is: R " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void checkStatus() {
		
	}
	@Override
	public String toString() {
		return ("Name: " + name + "\nAccount Number: " + accountNumber + 
				" \nRouting Nr: " + routingNumber + "\nBalance: " + balance); 
	}
}

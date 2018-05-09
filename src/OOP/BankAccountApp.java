package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		
		// Creating a new bank Account >> Think instantiate a new object
		BankAccount acc1 = new BankAccount();
		
		
		//acc1.name = "Kevin Kemp";
		// With Encapsulation: public API Methods
		acc1.setName("Kevin Kemp");
		System.out.println(acc1.getName());
		acc1.setSsn("123456789");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "23456789000";
		acc1.balance = 1000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(500);
		acc1.deposit(500);
		acc1.deposit(500);
		acc1.withdraw(2000);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Saving Account", 5000);
		acc2.accountNumber = "23456789000";
		acc2.checkBalance();
		
		
		BankAccount acc3 = new BankAccount("Saving Account", 5000);
		acc3.accountNumber = "23456789000";
		acc3.checkBalance();
	
		/*
		// Demo for Inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Kevin";
		cd1.accountType = "CD Account";
		cd1.interestRate = "4.5";
		System.out.println(cd1.toString());
		cd1.compound();
		**/
	}	
}

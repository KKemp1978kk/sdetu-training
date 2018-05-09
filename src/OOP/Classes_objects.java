package OOP;

class Person {
	String name;
	String email;
	String phoneNr;

	void walk() {
		System.out.println(name + " Is Waking");
	}

	void eat() {
		System.out.println(name + " Is Eating");
	}

	void sleep() {
		System.out.println(email + " Is Sleeping");
	}

	void email() {
		System.out.println(email + " Is already full");
	}
}

public class Classes_objects {

	public static void main(String[] args) {
		// Instantiating an object >> person1
		Person person1 = new Person();

		// Define the property person1
		person1.name = "Kevin";
		person1.email = "kemp1978k@gmail.com";
		person1.phoneNr = "082_81_777_03";

		// Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		/*

		// Attributes, Variables, adjectives, descriptors
		String name = "Sharon ";
		String email = "s@vodamail.com";
		String phoneNr = "08281768703";

		// Action, activity, behavior
		System.out.println(name + "Is Walking");
		//System.out.println(name + "Is Sleeping");
		walking(name);
		
		
		
		// What if we wanted to do this for another person
		String name1 = "Michael ";
		String email1 = "s@vodamail.com";
		String phoneNr1 = "0828156703";

		// Action, activity, behavior
		//System.out.println(name1 + "Is Walking");
		walking(name1);
		System.out.println(name1 + "Is Sleeping");
		
		// What about binding Attributes and properties together
		
	}

	// Enhancing by adding functions to minimize code
	static void walking(String name1) {
		System.out.println(name1 + "Is Walking"); **/
	}
}













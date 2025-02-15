package oops;

/**
 * 
 * static keyword:
 * 
 * 1. A static method can:
 * 		- Call only static methods
 * 		- Access only static fields
 * 2. Static variables are stored in the heap memory
 * 3. Static methods are commonly used to create utility or helper classes so that we can get them without creating a new object of these classes
 * 4. Static methods can't use this or super keyword
 * 5. Static methods can't be overriden, because they are resolved at compile time and are associated with the class itself, not with instances of the class
 * 6. When you define a static method with the same signature as a static method in the base class, it is known as method hiding
 * 7. Static method cannot access non-static members (variable or methods) directly
 */
public class StaticKeyword {
	
	// Static variables
	static int a = 20;
	static int b = 10;
	
	// Non static variable
	int c = 30;
	
	// Static method
	static int add() {
		return a + b;
	}
	
	// Non static method
	int subtract() {
		return a - b;
	}
	
	// Static block
	// It is executed exactly once when the class is first loaded
	// If static variables require additional, multi-statement logic during initialization, we can use a static block.
	static {
		System.out.println("Static block is executed");
		a = a + b; // a=30
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// static method can access static methods and static fields only. 
		// In order to call a non-static method in a static method, we must use an instance of the class
		
		// System.out.println(subtract()); // static method cannot call non static method; object is required
		System.out.println(add()); // static method can call static method only
		
		// System.out.println(c); // Static method cannot access non static fields
	}
}
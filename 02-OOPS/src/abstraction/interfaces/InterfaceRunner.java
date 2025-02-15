package abstraction.interfaces;

/**
 * Interfaces
 * Interfaces in Java are like contracts or blueprints that define a set of methods that implementing classes must adhere to. 
 * They provide a way to specify behavior without specifying how that behavior is implemented.
 * It has static constants and abstract methods.
 * It provides total abstraction; means all the methods in an interface are declared with the empty body. A class that implements an interface must implement all the methods declared in the interface.
 * 
 * Some key points:
 * 1. Fields in interface are public, static and final by default. And Methods are public and abstract.
 * 2. A class extends another class, an interface extends another interface, but a class implements an interface.
 * 3. Multiple inheritance is not supported through class in java, but it is possible by an interface. 
 * 	  Consider an example: Two classes A and B both have a method print(). If another class C inherits both A and B. Then If we call print() with C's object, then there is an ambiguity of which method will be called. 
 * 	  But instead of class if we have interface, then C will have to provide implementation for the print(). Then the call to print() with C's object will not be ambiguous.
 * 4. Since Java 8, we can have default and static methods in an interface.
 * 5. Since Java 9, we can have private methods in an interface.
 * 6. Interface cannot have constructor
 * 7. Interfaces achieves full abstraction
 */
interface RemoteControl {
	public void up();
	public void down();
	public void left();
	public void right();
}

class TVRemoteControl implements RemoteControl {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Volume up");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Volume down");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Previous channel");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Next channel");
	}
}

public class InterfaceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteControl remote = new TVRemoteControl();
		remote.up();
		remote.down();
		remote.left();
		remote.right();

	}

}

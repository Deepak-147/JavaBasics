package basics;

class Person {
	String name;
}

/**
 * 
 * @author ldeepak
 * Java always uses pass-by-value
 * For primitives, it passes a copy of the value.
 * For objects, it passes a copy of the reference (not the object itself).
 * Modifying object fields inside a method affects the original object.
 */
public class PassByValueVsReference {

	public static void main(String[] args) {
		
		// Primitives
		// copy of the value is passed to the method
		int num = 5; 
		modify(num);
		System.out.println("num after modify(): "+num);
		
		// Object
		// copy of the reference is passed to the method
		Person p = new Person(); 
		p.name="Hello";
		modify(p);
		System.out.println("p.name after modify(): "+p.name);
	}

	private static void modify(Person p) {
		p.name="Hi";
	}

	private static void modify(int num) {
		num += 10;
	}

}

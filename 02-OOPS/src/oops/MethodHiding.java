package oops;

/**
 * Method Hiding:
 * When a subclass defines a static method with the same signature as a static method in the superclass, the method in the subclass hides the method in the superclass. This is known as method hiding.
 *
 * Key points:
 * 1) Method hiding applies only on static methods.
 * 2) Instance methods or non-static methods cannot be hidden, they can only be overridden.
 * 3) Method hiding is resolved at compile time, based on the reference type, not the object type.
 * 4) The access modifier for a hidden method can allow more, but not less, access than the hidden method.
 * 5) Method hiding is not polymorphism.
 */
class Parent {
    static void show() {
        System.out.println("Parent's static method");
    }
}

class Child extends Parent {
    static void show() { // Method hiding, not overriding
        System.out.println("Child's static method");
    }
}

public class MethodHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child(); // p is a reference of type Parent but refers to an object of type Child
        p.show();  // Calls Parent's static method (not Child's)

        Child c = new Child();
        c.show();  // Calls Child's static method
	}
}
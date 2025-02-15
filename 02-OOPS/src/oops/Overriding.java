package oops;

/***
 * 
 * Overriding:
 * Method overriding in Java is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. 
 * 
 * Run-time Polymorphism (Dynamic binding or Dynamic Method Dispatch)
 * Overriding is an example of run-time polymorphism, as the determination of which method to execute is made at runtime based on the actual type of the object, not the reference type.
 * 
 * Some key points:
 * 1) The access modifier for an overriding method can allow more, but not less, access than the overridden method.
 * 	For example, a protected instance method in the superclass can be made public, but not private, in the subclass.
 * 	Doing so will generate a compile-time error.
 * 
 * 2) Final methods cannot be overridden
 * 
 * 3) Static methods cannot be overridden.
 * 	When you define a static method with the same signature as a static method in the base class, it is known as method hiding.
 * 
 * 4) Private methods cannot be overriden
 * 
 */
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * At compile time the compiler only knows about the methods and members available in Animal class.
		 * However, at run-time, when the new Dog() object is created, the actual object type is Dog.
		 * This means that the object possesses all the methods and members of the Dog class, including overridden methods. 
		 */
		Animal animal = new Dog();
        animal.makeSound(); // Output: Dog barks
	}
}

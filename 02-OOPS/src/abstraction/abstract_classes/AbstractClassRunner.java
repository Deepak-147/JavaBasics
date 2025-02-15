package abstraction.abstract_classes;

/**
 * 
 * Abstract class:
 * An abstract class is a class that cannot be instantiated on its own and is meant to be subclassed.
 * It serves as a blueprint for other classes and can contain both abstract (unimplemented) methods and concrete (implemented) methods.
 * They provide a general outline of how something should be built, but they're not complete on their own. 
 * These unimplemented methods act like placeholders, waiting for subclasses to provide their specific implementations. 
 * This allows abstract classes to serve as a foundation for creating more specialized classes while ensuring that they all share common behaviors and characteristics.
 *
 * Some key points:
 * 1. If a class contains at least one abstract method, it must be declared as an abstract class using the abstract keyword.
 * 2. Abstract Class Cannot be Instantiated. Abstract classes exist solely to be subclassed and cannot be instantiated on their own.
 * 3. Any concrete subclass of an abstract class must implement all abstract methods defined by its superclass.
 * 4. Abstract Classes can have Constructors
 * 5. Abstract classes achieves partial abstraction
 * 
 */
abstract class Animal {
	// Concrete method
	public void eat() {
		System.out.println("This animal is eating");
	}
	
	// Concrete method
	public void sleep() {
		System.out.println("This animal is sleeping");
	}
	
	// Abstract method
	abstract public void makeSound();
}

class Dog extends Animal {

	// Subclass implements the Baseclass abstract method
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("This animal is Barking");
	}
	
}

class Bird extends Animal {

	// Subclass implements the Baseclass abstract method
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("This animal is Chirping");
	}
	
}

public class AbstractClassRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Animal animal = new Dog(); // Upcasting; reference variable of Parent class refers to the object of Child class
		animal.eat();
		animal.sleep();
		animal.makeSound();
		
		animal = new Bird();
		animal.eat();
		animal.sleep();
		animal.makeSound();
	}

}

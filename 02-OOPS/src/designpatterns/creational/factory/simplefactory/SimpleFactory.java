package designpatterns.creational.factory.simplefactory;

/**
 * 
 * @author ldeepak
 * 
 * Simple Factory Design Pattern
 * The Factory Pattern is a creational design pattern that provides an interface for creating objects without exposing the instantiation logic.
 * Instead of calling the constructor directly (new keyword), the object creation is delegated to a factory method.
 *
 * Real world analogy:
 * Consider a Car Factory:
 * A customer orders a car (SUV, Sedan, or Hatchback).
 * Instead of making the car themselves, they request the factory.
 * The factory produces the correct car based on the request.
 *
 * Drawbacks:
 * - To add a new type of car, lets say a F1 car, we have modify the CarFactory. This violates the OCP (Open/Closed Principle)
 * - The CarFactory is tighly coupled to all the concrete classses, making it difficult to modify, extend, or test the system independently.
 *
 * It is better to use the Factory method design pattern which handles all of these issues.
 */

// Define an Interface (Product)
interface Car {
	void drive();
}

// Create Concrete classes (implementations)
class Sedan implements Car {
	public void drive() {
		System.out.println("Driving a Sedan");
	}
}

// Create Concrete classes (implementations)
class SUV implements Car {
	public void drive() {
		System.out.println("Driving an SUV");
	}
}

//Create Concrete classes (implementations)
class Hatchback implements Car {
	public void drive() {
		System.out.println("Driving a Hatchback");
	}
}

// Factory class, produces products. Central object creation logic
class CarFactory {
    public static Car getCar(String type) {
        if (type.equalsIgnoreCase("Sedan")) {
            return new Sedan();
        } else if (type.equalsIgnoreCase("SUV")) {
            return new SUV();
        } else if (type.equalsIgnoreCase("Hatchback")) {
            return new Hatchback();
        }
        throw new IllegalArgumentException("Unknown car type: " + type);
    }
}

// Client code uses Factory class
public class SimpleFactory {
	public static void main(String[] args) {
		Car sedan = CarFactory.getCar("Sedan");
	    sedan.drive(); // Output: Driving a Sedan
	    
	    Car suv = CarFactory.getCar("SUV");
        suv.drive(); // Output: Driving an SUV
        
        Car hb = CarFactory.getCar("Hatchback");
        hb.drive(); // Output: Driving an Hatchback
	}
}
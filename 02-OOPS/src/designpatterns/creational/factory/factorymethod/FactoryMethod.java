package designpatterns.creational.factory.factorymethod;

/**
 * 
 * @author ldeepak
 * 
 * Factory Method Design Pattern
 * 
 * The Factory Method Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
 * Instead of calling a constructor (new keyword) directly, we delegate object creation to a method called the factory method.
 *
 * ✅ Key Benefits:
 * Encapsulates Object Creation – The client doesn't need to know the exact class.
 * Supports Loose Coupling – The client depends on an interface rather than a concrete class.
 * Easier to Extend – New types can be added without modifying existing client code.
 *
 * The Factory Method Pattern consists of:
 * - Product (Interface/Abstract Class) – Defines the type of object to be created.
 * - ConcreteProduct – Implements the Product interface.
 * - Creator (Abstract Factory Class) – Declares the factory method to create objects.
 * - ConcreteCreator – Implements the factory method to instantiate objects.
 *
 * Real world analogy:
 * Consider a Car Factory:
 * A customer orders a car (SUV, Sedan, or Hatchback).
 * Instead of making the car themselves, they request the factory.
 * The factory produces the correct car based on the request.
 */

// Step 1: Define the Product Interface
interface Car {
	void drive();
}

// Step 2: Create Concrete Product Classes
class Sedan implements Car {
	public void drive() {
		System.out.println("Driving a Sedan");
	}
}

class SUV implements Car {
	public void drive() {
		System.out.println("Driving an SUV");
	}
}

class Hatchback implements Car {
	public void drive() {
		System.out.println("Driving a Hatchback");
	}
}

// Added new class to Simple factory
class F1 implements Car {
	public void drive() {
		System.out.println("Driving a F1");
	}
}

// Step 3: Create Abstract Factory (Declares Factory Method)
abstract class CarFactory {
	abstract Car createCar();
}

// Step 4: Create Concrete Factories
class SedanFactory extends CarFactory {
	public Car createCar() {
		return new Sedan();
	}
}

class SUVFactory extends CarFactory {
	public Car createCar() {
		return new SUV();
	}
}

class HatchbackFactory extends CarFactory {
	public Car createCar() {
		return new Hatchback();
	}
}

class F1Factory extends CarFactory {
	public Car createCar() {
		return new F1();
	}
}

// Client code uses Factory class method
public class FactoryMethod {
	public static void main(String[] args) {
		CarFactory sedanFactory = new SedanFactory();
		Car sedan = sedanFactory.createCar();
		sedan.drive();  // Output: Driving a Sedan

		CarFactory suvFactory = new SUVFactory();
		Car suv = suvFactory.createCar();
		suv.drive();  // Output: Driving an SUV

		CarFactory hatchbackFactory = new HatchbackFactory();
		Car hatchback = hatchbackFactory.createCar();
		hatchback.drive();  // Output: Driving a Hatchback

		CarFactory f1Factory = new F1Factory();
		Car f1 = f1Factory.createCar();
		f1.drive();  // Output: Driving a F1
	}
}
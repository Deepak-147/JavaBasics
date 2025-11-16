package oops;

/**
 * Polymorphism: means many forms
 * It allows objects of different types to be treated as if they are of a common type. <br>
 * In simpler terms, think of it like this: imagine you have a remote control with buttons, and no matter what device you point it at a TV, a DVD player, or a stereo, it knows how to control it. <br>
 * Similarly, in programming, polymorphism allows you to use a common interface (like a remote control) to work with different types of objects (like devices) without needing to know their specific types at compile time. <br><br>
 * 
 * Java supports two types of polymorphism: <br><br>
 * 1. Compile-time Polymorphism (Method Overloading) or Static binding: Compiler determines which overloaded method to call based on the method signature during compilation. <br>
 * 2. Run-time Polymorphism (Method Overriding) or Dynamic binding or Dynamic Method Dispatch: The determination of which method to execute is made at runtime based on the actual type of the object, not the reference type. <br><br>
 * 
 * We can implement method overloading in two different ways: <br><br>
   - implementing two or more methods that have the same name but take different numbers of arguments <br>
   - implementing two or more methods that have the same name but take arguments of different types <br><br>
 * */
public class Overloading {

	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int multiply(int a, int b, int c) {
		return a * b * c;
	}
	
	public double multiply(double a, double b) {
		return a * b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading obj = new Overloading();
		System.out.println(obj.multiply(10, 20));
		System.out.println(obj.multiply(10.0, 20.0));
		System.out.println(obj.multiply(10, 20, 30));
		
		// Type promotion:
		// When one given type is implicitly promoted to another one when there’s no matching between the types of the arguments passed to the overloaded method and a specific method implementation.
		System.out.println(obj.multiply(10, 20.0)); // First argument is promoted to double as there is no matching implementation for multiply(int and double)
	}

}

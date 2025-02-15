package oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100); // This will use our own constructor
		MotorBike honda = new MotorBike(80); // This will use our own constructor
		MotorBike bmw = new MotorBike(); // To use default constructor now, we need to explicitly provide it.

		ducati.start();
		honda.start();

		/**
		 * Incorrect way: Directly accessing member variables outside its class.
		 **/
		// ducati.speed = 200;
		// honda.speed = 100;

		/**
		 * Correct way: Using getters and setters to access member variable of the class.
		 * Encapsulation: Data (variables) are enclosed within the class and can only be accessed through controlled methods (getters and setters).
		 * - Hide internal details of an object
		 * - Protects data from unintended modifications by declaring them as private
		 * - Provides controlled access to data using getters and setters methods
		 * 
		 * Real world example: A Bank Account should not allow direct modification of balance. Instead, deposits and withdrawals should follow controlled rules.
		 */
		ducati.setSpeed(200);
		honda.setSpeed(100);

		System.out.println(ducati.getSpeed()); // 200
		System.out.println(honda.getSpeed()); // 100
		System.out.println(bmw.getSpeed()); // 5

		// Bad code will not be able to set -ve speed, because we have added logic to handle that in the setter.
		ducati.setSpeed(-100);
		System.out.println(ducati.getSpeed()); // 200

		ducati.increaseSpeed(50);
		honda.increaseSpeed(50);
		System.out.println(ducati.getSpeed()); // 250
		System.out.println(honda.getSpeed()); // 150

		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(50);
		System.out.println(ducati.getSpeed()); // 200
		System.out.println(honda.getSpeed()); // 100
	}
}

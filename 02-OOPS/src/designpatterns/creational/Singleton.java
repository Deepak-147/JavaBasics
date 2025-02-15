package designpatterns.creational;

/**
 * @author ldeepak
 * 
 * Singleton Design Pattern
 * 
 * https://refactoring.guru/design-patterns/singleton
 * Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
 * 
 * Real-World Analogy:
 * Think of a government.
 * - There's only one President at a time.
 * - Everyone accesses government decisions via the President.
 * - A new President is only created when the old one is replaced.
 * 
 * When to Use Singleton?
 * 
 * when you need a single shared instance, such as:
 * - Database connection pools
 * - Logging framework (Logger)
 * - Thread pools
 * - Configuration managers
 * - Cache managers
 * 
 * How to Implement Singleton in Java?
 * - Eager Initialization (Thread-Safe, but Less Flexible)
 * - Lazy Initialization (Not Thread-Safe, Avoid in Multithreading)
 * - Thread-Safe Singleton (Synchronized Method)
 * - Double-Checked Locking (Thread-Safe & Efficient)
 * - Bill Pugh Singleton (Best Performance & Thread-Safe)
 * - Singleton in Enum (Most Secure & Simple)
 * 
 * https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples
 */

/**
 * Bill Pugh Singleton (Best Performance & Thread-Safe)
 * ✅ How It Works (Step-by-Step Execution Flow):
 * Class Singleton is loaded → The inner class Holder is not loaded yet.
 * getInstance() is called for the first time → JVM loads Holder class.
 * INSTANCE is created once and stored in memory.
 * Every subsequent call returns the same instance, ensuring Singleton behavior.
 * 
 * JVM Class Loading Mechanism ensures that the inner static class Holder is loaded only once when first accessed. This means multiple threads will not create multiple instances.
 * 
 * Why does the static inner class work?
 * JVM loads static classes only when first accessed, ensuring lazy loading and thread safety without synchronization.
 */
public class Singleton {
	
	private Singleton() {}  // Private constructor prevents instantiation

    private static class Holder {  // Static inner class
        private static final Singleton INSTANCE = new Singleton();  // Instance is created only when accessed
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;  // Returns the single instance
    }
    
	public static void main(String[] args) {
		Runnable task = () -> {
			Singleton instance = Singleton.getInstance();
			System.out.println("Instance: " + instance); // Both threads get the same instance!
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        
        t1.start();
        t2.start();
	}
}

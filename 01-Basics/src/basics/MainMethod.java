package basics;

/**
 * @author ldeepak
 * main() can be overloaded, but cannot be overridden
 *
 * When you run a Java program, the Java Virtual Machine (JVM) looks for the entry point: a method with the exact signature public static void main(String[] args) in the specified class (in your case, MainMethod).
 *
 * Here’s how it works:
 * Class Loading: The JVM loads the class you specify (e.g., MainMethod) using the class loader.
 * Method Search: The JVM searches for the main method with the signature: public static void main(String[] args)
 * Method Invocation: If found, the JVM calls this method, passing any command-line arguments as the args array.
 * Execution: The code inside the main method runs. Any overloaded main methods (with different parameters) are ignored by the JVM unless called manually from within the standard main.
 */
public class MainMethod {
	
	// Standard main() method – called by JVM
    public static void main(String[] args) {
        System.out.println("Standard main method");
        
        // Manually calling overloaded main methods
        main(10);
        main("Hello");
    }
    
    // Overloaded main with an int parameter
    public static void main(int num) {
        System.out.println("Overloaded main with int: " + num);
    }

    // Overloaded main with a String paramete
    public static void main(String msg) {
        System.out.println("Overloaded main with String: " + msg);
    }
}

package basics;

/**
 * 
 * @author ldeepak
 * main() can be overloaded, but cannot be overridden
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

    // Overloaded main with a String parameter
    public static void main(String msg) {
        System.out.println("Overloaded main with String: " + msg);
    }
}

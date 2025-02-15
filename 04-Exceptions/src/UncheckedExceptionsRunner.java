/**
 * 
 * Unchecked Exceptions
 * Unchecked exceptions are the exceptions that are not checked at compile-time.
 * Examples: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException.
 *
 */
public class UncheckedExceptionsRunner {

	public static void main(String[] args) {
		// Array of size 5
		int[] nums = new int [5];
		
		int myNum = nums[5]; // This will cause an exception (Run time or Unchecked exception)
		
		System.out.println(myNum); // This will not get executed
	}
}
/**
 * In Java, the code can experience errors while executing our instructions.
 * Good exception handling can handle errors gracefully and give the user still a positive experience.
 * We need to make sure that our code has a plan for when things go wrong.
 *
 * Ultimately, exceptions are just Java objects with all of them extending from Throwable
 * 				  ---> Throwable <---
 *               |    (checked)     |
 *               |                  |
 *               |                  |
 *       ---> Exception           Error
 *       |    (checked)        (unchecked)
 *       |
 * RuntimeException
 * (unchecked)
 */
public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		method1();
		System.out.println("Main ended"); // will be printed
	}

	private static void method1() {
		method2();
		System.out.println("method1 ended"); // will be printed
	}

	private static void method2() {
		try {
			String s = null;
			s.length(); // THIS will cause exception. It will not be thrown to method1. So method1 prints its content as usual and so does main.
			System.out.println("method2 ended"); // Not printed
		}
		// Strategies to handle the Exception.
		catch (NullPointerException ex) {
			System.out.println("NULL POINTER EXCEPTION");
			ex.printStackTrace();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
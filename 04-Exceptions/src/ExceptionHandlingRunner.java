public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		method1();
		System.out.println("Main ended");
	}

	private static void method1() {
		method2();
		System.out.println("method1 ended");
	}

	private static void method2() {
		String s = null;
		s.length(); // THIS will cause exception. It will be thrown to method1. Now method1 also has no handling, so it throws to main(). Main also has no handling, which ultimately throws to system.
		System.out.println("method2 ended");
	}
}
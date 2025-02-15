import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int[] nums = { 1, 2, 3 };
			int num = nums[3]; // THIS will cause exception
//			sc.close(); // THIS will not be executed and we will have memory leaks
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			// Code will always execute, irrespective of the exception
			if (sc != null) {
				sc.close();				
			}
		}
	}
}
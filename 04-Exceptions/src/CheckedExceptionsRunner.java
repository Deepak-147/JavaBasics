import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 
 * Checked Exception
 * Checked exceptions are the exceptions that are checked at compile-time.
 * Examples: IOException, FileNotFoundException, SQLException
 *
 */
public class CheckedExceptionsRunner {
	
	// This will throw a Checked exception. How to handle? 
	// (Two ways):
	/// 1. Surround with try/catch block (Used this in the example)
	public static void main(String[] args) {
		File file = new File("not_existing_file.txt");
		try {
			FileInputStream stream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	}
	
	// 2. Add throws keyword to the method declaration
//	public static void main(String[] args) throws FileNotFoundException {
//		File file = new File("not_existing_file.txt");
//		FileInputStream stream = new FileInputStream(file);
//	}
}

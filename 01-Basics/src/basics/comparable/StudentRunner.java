package basics.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(34, "Ram"));
		students.add(new Student(14, "Shyam"));
		students.add(new Student(92, "Mohan"));
		students.add(new Student(28, "Raju"));
		students.add(new Student(55, "Mohit"));
		
		System.out.println(students);
		
		// For this to work, the list item (Student) must implement comparable interface and define compareTo()
		Collections.sort(students); // Ascending order
		
		System.out.println(students);
		
		// To get the descending order, we will have to update the compareTo() in Student class. 
		// This is the limitation of Comparable. It allows only one comparison strategy. 
	}

}

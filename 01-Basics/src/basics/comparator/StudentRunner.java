package basics.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
	
		// Separate class MarksComparator that implements Comparator
//		Collections.sort(students, new MarksComparator());
		
		// Separate class NameComparator that implements Comparator
//		Collections.sort(students, new NameComparator());
		
		// Anonymous class that implements Comparator. Inline.
		Collections.sort(students, new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				
				// TODO Auto-generated method stub
				return (o1.getName().compareTo(o2.getName()));
			}
		});
		
		System.out.println(students);
		
	}
	
//	Refer this for better understanding of comparator: https://www.youtube.com/watch?v=ZA2oNhtNk3w

}

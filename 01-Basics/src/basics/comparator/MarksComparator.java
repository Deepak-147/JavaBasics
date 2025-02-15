package basics.comparator;

import java.util.Comparator;

// Compare in ascending order of marks
public class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		// Compare first student o1 with second student o2.
		// return 1, indicates swap
		
		// TODO Auto-generated method stub
		if (o1.getMarks() > o2.getMarks()) return 1; // if marks for o1 > marks of o2, then swap. So large values will be swapped downwards. This is ascending order.
		else if (o1.getMarks() < o2.getMarks()) return -1;
		return 0;
		
	}

}

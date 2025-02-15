package list;

import java.util.Iterator;
import java.util.Stack;

public class StackRunner {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		
		// Insertion
		s.push(1);
		s.push(10);
		s.push(2);
		s.push(20);
		
		// Removal
		s.pop();
		
		// Iteration
		Iterator<Integer> itr = s.iterator();
		
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
        }
	}
}

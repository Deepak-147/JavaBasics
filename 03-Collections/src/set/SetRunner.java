package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		
		List<Character> myList = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		
		// Do not care about sorted order and order of insertion
		Set<Character> myHashSet = new HashSet<Character> (myList);
		System.out.println(myHashSet); // [A, B, F, Z]
		
		myHashSet.add('P');
		System.out.println(myHashSet.contains('P')); // true
		System.out.println(myHashSet.size()); // 5
		myHashSet.remove('P');
		System.out.println(myHashSet.isEmpty()); // false
		
		/********************
		 * Iterating a set
		 ********************/
		Iterator<Character> itr = myHashSet.iterator();
        while (itr.hasNext()) {
        	System.out.print(itr.next() + " ");
        }
        System.out.println();
        
        
        for (Character ch : myHashSet) {
        	System.out.print(ch + " ");
        }
        System.out.println();
        
		// Order of insertion is maintained
		Set<Character> myLinkedHashSet = new LinkedHashSet<Character> (myList);
		System.out.println(myLinkedHashSet); // [A, Z, B, F]
		
		
		// Sorted order is maintained
		Set<Character> myTreeSet = new TreeSet<Character> (myList);
		System.out.println(myTreeSet); // [A, B, F, Z]
	}
}

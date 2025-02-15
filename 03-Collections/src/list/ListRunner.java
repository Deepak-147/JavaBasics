package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListRunner {

	public static void main(String[] args) {

		List<String> myList = List.of("Cat", "Dog", "Bat"); // Immutable
		
//		myList.add("Goat"); // Not allowed
//		Collections.sort(myList); // Not allowed
		
		// Al for Array list
		/****************************************
		 * Creating a List (ArrayList)
		 ****************************************/
		List<String> myListAl = new ArrayList<> (); // Mutable
		
		/********************
		 * Adding elements
		 ********************/
		myListAl.add("Goat"); // allowed
		myListAl.add("Monkey");
		myListAl.add("Donkey");
		myListAl.add(1, "Cat"); // insert at index
		
		System.out.println(myListAl); // [Goat, Cat, Monkey, Donkey]
		System.out.println();
		
		/**********************
		 * Updating elements
		 **********************/
		myListAl.set(1, "Dog");
		
		System.out.println(myListAl); // [Goat, Dog, Monkey, Donkey]
		System.out.println();
		
		/**********************
		 * Removing elements
		 **********************/
		myListAl.remove("Goat");
		myListAl.remove(1); // remove at index
		
		System.out.println(myListAl); // [Dog, Donkey]
		System.out.println();
		
		/***********************
		 * Accessing elements
		 ***********************/
		System.out.println(myListAl.get(0));
		
		System.out.println();
		
		/***********************
		 * Iterating list
		 ***********************/
		// Using traditional for loop
		for (int i=0; i<myListAl.size(); i++) {
			System.out.println(myListAl.get(i));
		}
		
		System.out.println();
		
		// Using enhanced for loop
		for (String element : myListAl) { 
			System.out.println(element);
		}
		
		System.out.println();
		
		// Using iterator
		Iterator<String> itr = myListAl.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		/*********************************
		 * SORTING:
		 * 1. Using Collections.sort(). Sorts only primitive data types
		 * 2. Using sort(). Used for sorting user defined objects
		 *********************************/
		
		// Using Collections.sort()
		Collections.sort(myListAl); // By default sort in ascending order
		System.out.println(myListAl); // [Dog, Donkey]
		
		System.out.println();
		
		/**
		 * Sorting used defined type:
		 * 1. Using Comparable interface
		 * 2. Using Comparator interface
		 * */
		List<Student> students = List.of(new Student(1, "Deepak"), new Student(100, "Adam"), new Student(2, "Eve"));
		
		// Creating new ArrayList as the above is immutable and hence cannot be sorted.
		List<Student> studentsAl = new ArrayList<Student> (students);
		
		// Way1: Using Comparable interface
		Collections.sort(studentsAl);
		System.out.println(studentsAl);
		
		System.out.println();
		
		// Way2: Using Comparator interface
		Collections.sort(studentsAl, new DescendingStudentComparator());
		System.out.println(studentsAl);
		
		System.out.println();
		
		// Way2: Using sort()
		studentsAl.sort(new DescendingStudentComparator());
		System.out.println(studentsAl);
		
		System.out.println();
	}
}

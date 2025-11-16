package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysRunner {

	public static void main(String[] args) {
		
		// The Arrays class in java.util package is a part of the Java Collection Framework. 
		// This class provides static methods to dynamically create and access Java arrays.
		
		/***********************
		 * Initializing an array
		 ***********************/
		// Way 1: using new operator. The elements will automatically be initialized with default initial values.
		// boolean 				-> false
		// int 					-> 0
		// double 				-> 0.0
		// String 				-> null
		// User defined type 	-> null
		int[] arr1 = new int[3]; // by default initializes with value 0
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        
        // Way 2: Using array literal. When elements are known in advance.
        int[] arr2 = {30,20,10};

		System.out.println(arr2.length); // 3; length is property

		/***********************
		 * Arrays class and its static methods
		 * Arrays class is a class containing static methods that are used with arrays in order to search, sort, compare, insert elements, or return a string representation of an array. It works with primitive types (int[], double[], etc.) and object arrays (String[], Integer[], etc.).
		 ***********************/

		System.out.println(Arrays.equals(arr1, arr2)); // false; Returns true if the two specified arrays of ints are equal to one another.

		Arrays.fill(arr1, -1); // Fill with values
		System.out.println(Arrays.toString(arr1)); // [-1, -1, -1] Returns a string representation of the contents of the specified array.

		Arrays.sort(arr2); // Sorts array in ascending order
		System.out.println(Arrays.toString(arr2)); // [10, 20, 30]

		Integer[] arr3 = {10, 20, 30}; // Notice use of wrapper class Integer. This is required to use Collections.reverseOrder()
		Arrays.sort(arr3, Collections.reverseOrder()); // Sort in descending order
		System.out.println(Arrays.toString(arr3));

		int[] arr4 = {10, 20, 30, 40, 50};
		int[] arr5 = Arrays.copyOfRange(arr4, 1, 3); // Copies the specified range of the specified array into a new array. Between index 1 (inclusive) and 3 (exclusive)
		System.out.println(Arrays.toString(arr5)); // [20, 30]

		List<Integer> myList = Arrays.asList(1,2,3); // This returns a fixed size list
		//myList.add(4); // Not allowed

		List<Integer> myModifiableList = new ArrayList<>(Arrays.asList(1,2,3)); // This will create a truly resizable arraylist
		myModifiableList.add(4); // Allowed
		System.out.println(myModifiableList); // [1, 2, 3, 4]

		/**
		 * Arraylist of integer array
		 */
        int[] pair = new int[2];
		pair[0] = 1;
		pair[1] = 3;
		
		List<int[]> al = new ArrayList<>();
		al.add(pair);
		
		// Iterating
		for (int[] temp : al) {
			for (int i : temp) {
				System.out.println(i);
			}
		}
		
		/**
         * Arraylist of ArrayList
         */
		List<List<Integer>> outerList = new ArrayList<>();
		List<Integer> inner = new ArrayList<>();
		inner.add(10);
		inner.add(20);
		
		outerList.add(inner);
		
		// Iterating
		for (List<Integer> l : outerList) {
			for (int i : l) {
				System.out.println(i);
			}
		}

		/**
		 * Array of Arraylists
		 */
		List<Integer>[] ar = new ArrayList[5];
		// initialize
		ar[0] = new ArrayList<>();
		
		// add members
		ar[0].add(10);
		ar[0].add(20);
		
		System.out.println(ar[0]); // [10, 20]

		int xx = 10;
		String xxx = String.valueOf(xx);
		String xxxx = Integer.toString(xx);
		System.out.println(xxx); // 10
		System.out.println(xxxx); // 10
		
		String yy = "23";
		int yyy = Integer.valueOf(yy);
		int yyyy = Integer.parseInt(yy);
		System.out.println(yyy); // 23
		System.out.println(yyyy); // 23
		
		char zero = yy.charAt(0);
		zero = '3';
		System.out.println(yy); // 23
	}
}
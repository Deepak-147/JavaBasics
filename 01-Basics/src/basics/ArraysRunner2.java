package basics;

import java.util.Arrays;
import java.util.Collections;

public class ArraysRunner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		 * Some useful static methods of Array class
		 ***********************/
        System.out.println(Arrays.equals(arr1, arr2)); // false; Returns true if the two specified arrays of ints are equal to one another. 
        
        Arrays.fill(arr1, -1); // Fill with values
        System.out.println(Arrays.toString(arr1)); // [-1, -1, -1] Returns a string representation of the contents of the specified array.
        
        Arrays.sort(arr2); // Sorts array in ascending order
        System.out.println(Arrays.toString(arr2)); // [10, 20, 30]
        
        Integer[] arr3 = {10, 20, 30}; // Notice use of wrapper class Integer. This is required to use Collections.reverseOrder()
        Arrays.sort(arr3, Collections.reverseOrder()); // Sort in descending order
        System.out.println(Arrays.toString(arr3)); // [30, 20, 10]
        
        int[] arr4 = {10, 20, 30, 40, 50};
		int[] arr5 = Arrays.copyOfRange(arr4, 1, 3); // between index 1(inclusive) and 3(exclusive)
		System.out.println(Arrays.toString(arr5)); // [20, 30]
		
	}

}

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
        
        /***********************
		 * Exploring some useful static methods of Array class
		 ***********************/
        
        System.out.println(Arrays.toString(arr2));
        
        Arrays.sort(arr2); // Sort (default ascending)
        System.out.println(Arrays.toString(arr2));
        
        Integer[] arr3 = {10, 20, 30}; // Notice use of wrapper class Integer. This is required to use Collections.reverseOrder()
        Arrays.sort(arr3, Collections.reverseOrder()); // Sort in descending order
        System.out.println(Arrays.toString(arr3));
        
        Arrays.fill(arr2, -1); // Fill with values
        System.out.println(Arrays.toString(arr2));
        
        
        /***
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
		
		/***
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
		
		System.out.println(ar[0]);
		
		
		/**
		 * Create Subarray from array
		 */
		
		int[] newArr = {10, 20, 30, 40, 50};
		
		int[] subArr = Arrays.copyOfRange(newArr, 1, 3); // between index 1(inclusive) and 3(exclusive)
		System.out.println(Arrays.toString(subArr));
		
		
		
		int xx = 10;
		String xxx = String.valueOf(xx);
		String xxxx = Integer.toString(xx);
		System.out.println(xxx);
		System.out.println(xxxx);
		
		String yy = "23";
		int yyy = Integer.valueOf(yy);
		int yyyy = Integer.parseInt(yy);
		System.out.println(yyy);
		System.out.println(yyyy);
		
		char zero = yy.charAt(0);
		zero = '3';
		System.out.println(yy);
	}

}

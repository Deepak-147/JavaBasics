package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicsRunner {

	public static void main(String[] args) {
		
		String s = "hello";
		System.out.println(s.length()); // 5 length() is a method
		
		int[] a = new int[25];
		System.out.println(a.length); // 25 length is property
		
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		mp.put('A', 1);
		mp.put('B', 2);
		System.out.println(mp.get('A')); // 1
		System.out.println(mp.getOrDefault('Z', 0)); // 0
		System.out.println(mp.get('A') == mp.get('B')); // This might not give accurate results always. DO NOT USE this direct comparison.
		System.out.println(mp.get('A').intValue() == mp.get('B').intValue()); // Use this way
		
		// Sort string
		char[] ca = s.toCharArray();
        Arrays.sort(ca);
        String key = String.valueOf(ca);
        System.out.println(key); // ehllo
        
        // Reversing collections
        List<Integer> myList = new ArrayList<>();
        
        myList.add(10);
        myList.add(20);
        myList.add(30);
        
        Collections.reverse(myList);
        System.out.println(myList.toString()); // [30, 20 ,10]
       
        
        /**
         * String conversions
         */
        StringBuilder sb = new StringBuilder("343");
        
        // string builder to string
        String str = sb.toString();
        
        // string to int
        int val = Integer.valueOf(str);
        System.out.println(val); // 343
        
        // int to string
        String b = String.valueOf(val);
        System.out.println(b); // 343
        
        // char to int: Some ways, all gives same response
        int bb = b.charAt(0) - '0';
        System.out.println(bb); // 3
        
        int bbb = b.charAt(0) - 48; // As ASCII value of '0' is 48
        System.out.println(bbb); // 3
        
        int bbbb = Character.getNumericValue(b.charAt(0));
        System.out.println(bbbb); // 3
        
        // String split
        String sss = "1,-2,N,N,3,4,N,N,5,N,N";
        
        String[] myS = sss.split(",");
        System.out.println(Arrays.toString(myS)); // [1, -2, N, N, 3, 4, N, N, 5, N, N]
        
        String strr = "Hello world";
        System.out.println(strr.substring(6)); // world, starts from the given index and goes till the last.
        System.out.println(strr.substring(6, 8)); // wo, string between start and end (exclusive).
        
        String a1 = new String("hello");
        String b1 = "hello";
        System.out.println(a1 == b1); // false, as a1 is in heap and b1 is in string pool
        System.out.println(a1.equals(b1)); // true, as values are same
        
	}

}

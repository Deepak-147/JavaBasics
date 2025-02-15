package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapRunner {

	public static void main(String[] args) {
		
		/*********************************
		 * Basic Operations
		 ***********************************/
		Map<String, Integer> myMap = Map.of("A", 3, "B", 5, "Z", 10); // map created this way is immutable.
//		myMap.put("R", 4); // Not allowed, as immutable
		
		System.out.println(myMap); // {A=3, B=5, Z=10} order could be anything
		System.out.println(myMap.get("Z")); // 10
		System.out.println(myMap.get("D")); // null
		System.out.println(myMap.getOrDefault("C", 0));
		System.out.println(myMap.size()); // 3
		System.out.println(myMap.isEmpty()); // false
		System.out.println(myMap.containsKey("Z")); // true
		System.out.println(myMap.containsValue(20)); // false
		Set<String> keySet = myMap.keySet();
		System.out.println(keySet); // [A, Z, B]; it returns a Set view of the keys contained in the map.
		System.out.println(myMap.values()); // [3, 5, 10]; it returns a Collection view of the values in the map.
		
		/*********************************
		 * Creating map from another map
		 ***********************************/
		Map<String, Integer> myHashMap = new HashMap<String, Integer>(myMap);
		myHashMap.put("F", 5); // inserts a new key value pair, if the key is not present. Otherwise update the existing key. In both cases it returns the previous value
		
		System.out.println(myHashMap); // {A=3, B=5, Z=10, F=5}
		
		myHashMap.put("Z", 11);
		
		System.out.println(myHashMap); // {A=3, B=5, Z=11, F=5}
		
		System.out.println(myHashMap.remove("A")); // 3
		
		/*********************************
		 * Traversing Map
		 * Two ways:
		 * 1. Using for each loop
		 * 2. Using Iterator
		 ***********************************/
		// Using for each loop
		// entrySet() returns a Set view of the elements of the map.
        for (Map.Entry<String, Integer> me : myHashMap.entrySet()) {
            // Printing key and its corresponding value
        	System.out.println(me.getKey() + " : " + me.getValue());
        }
        
        // Using Iterator
        Set set = myHashMap.entrySet(); //Converting to Set so that we can traverse  
        Iterator itr = set.iterator();  
        while(itr.hasNext()){  
            //Converting to Map.Entry so that we can get key and value separately  
            Map.Entry entry=(Map.Entry)itr.next();  
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        
        // Sorting a hashmap:
        // 1. Use a TreeMap instead. It keeps sorted order.
        Map<Integer, Integer> sortedMap = new TreeMap<>();
        sortedMap.put(1, 11);
        sortedMap.put(5, 55);
        sortedMap.put(-3, 33);
        sortedMap.put(4, 44);
        System.out.println(sortedMap.toString()); // {-3=33, 1=11, 4=44, 5=55}. Sorted order is maintained.
        
        // 2. Store keys in an arraylist. Then sort this list using Collection.sort(). Finally iterate over the sorted list of keys and access the mapped value.
        Map<Integer, Integer> notSortedMap = new HashMap<>();
        notSortedMap.put(1, 11);
        notSortedMap.put(5, 55);
        notSortedMap.put(-3, 33);
        notSortedMap.put(4, 44);
        
        List<Integer> keys = new ArrayList<>(notSortedMap.keySet());
        
        Collections.sort(keys);
        
        for (int i : keys) {
        	System.out.println(i + " = " +notSortedMap.get(i)); // this gives sorted order
        }
	}
}

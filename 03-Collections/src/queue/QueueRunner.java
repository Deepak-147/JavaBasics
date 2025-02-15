package queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {

	public static void main(String[] args) {
		
		/****************************************
		 * Creating a Queue (PriorityQueue)
		 ****************************************/
		Queue<String> pq = new PriorityQueue<String>(); // By default min-heap.
		
		/********************
		 * Adding elements: 
		 * add():  Inserts the element if possible. Otherwise throws an exception.
		 * offer(): Inserts the element if possible. Otherwise returns false.
		 ********************/
		pq.offer("Dog");
		pq.offer("Donkey");
		pq.offer("Lion");
		
		System.out.println(pq); // [Dog, Donkey, Lion]
		System.out.println();
		
		/*************************************
		 * Examine the element:
		 * element(): Return, but do not remove, the head of the queue. Otherwise throws an exception.
		 * peek(): Return, but do not remove, the head of the queue. Otherwise returns null.
		 *************************************/
		System.out.println(pq.peek()); // prints Dog
		System.out.println();
		
		/**********************
		 * Removing elements: 
		 * remove(): Remove and return the head of the queue. Otherwise throws an exception.
		 * poll(): Remove and return the head of the queue. Otherwise returns null.
		 **********************/
		System.out.println(pq.poll()); // Removes Dog
//		System.out.println(pq.remove("Lion")); // Removes specific element
		System.out.println();
		
		System.out.println(pq); // [Donkey, Lion]
		System.out.println();
		
		/********************
		 * Iterating queue
		 ********************/
		Iterator<String> itr = pq.iterator();
        while (itr.hasNext()) {
        	System.out.print(itr.next() + " ");
        }
        System.out.println();
        
        for (String s : pq) {
        	System.out.print(s + " ");
        }
        System.out.println();
        
        // Max Heap
        // Way 1
//        Queue<String> pq2 = new PriorityQueue<String>(Collections.reverseOrder()); 
        
        // Way 2: Creating separate class for the comparator
//        class reverseLexicographicComparator implements Comparator<String> {
//        	@Override
//    		public int compare(String a, String b) {
//              return b.compareTo(a);
//        	}
//        }
//        Queue<String> pq2 = new PriorityQueue<>(new reverseLexicographicComparator());
        
        // Way 3: Create a comparator variable
//        Comparator<String> reverseLexicographicComparator = new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                return b.compareTo(a);
//            }
//        };
//        Queue<String> pq2 = new PriorityQueue<>(reverseLexicographicComparator);
        
      
        // Way 4: Inline comparator
//        Queue<String> pq2 = new PriorityQueue<>(new Comparator<String>() {
//        	@Override
//            public int compare(String a, String b) {
//                return b.compareTo(a);
//            }
//        });
        
        // Way 5: even shorter
        Queue<String> pq2 = new PriorityQueue<String>((a, b) -> b.compareTo(a));
        
        pq2.offer("Dog");
		pq2.offer("Donkey");
		pq2.offer("Lion");
        
		Iterator<String> itr2 = pq2.iterator();
        while (itr2.hasNext()) {
        	System.out.print(itr2.next() + " ");
        }
	}
}
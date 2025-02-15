package queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCustomComparatorRunner {
	
	public static void main(String[] args) {
		Queue<String> myQueue = new PriorityQueue<>(new StringLengthComparator());
		myQueue.addAll(List.of("Zebra", "Monkey", "Cat"));
		
		System.out.println(myQueue);
	}
}

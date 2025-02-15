/***
 * 
 * Multitasking
 * 	---> Process based:
 * 			- Allows two or more programs concurrently, 
 * 			- Process is heavy weight
 * 			- Requires more overhead
 *  ---> Thread based 
 *  		- Allows a program to perform two or more tasks simultaneously
 *  		- Thread is light weight
 *  		- Requires less overhead
 *  
 *  Multithreading is a special form of Multitasking
 *  
 *  Lifecycle of a thread:
 *  	1. New: When a thread is newly created
 *  	2. Runnable: After start(), thread is in Runnable state. It is the responsibility of OS or thread scheduler to run this thread instantly or keep it in the runnable thread pool
 *  	3. Running: After run(), thread scheduler picks one of the threads from the runnable thread pool and make it run
 *  	4. Non runnable (Blocked/Waiting): When a thread is alive and waiting for some resources, it is said to be in Non runnable state. Once the wait is over the thread is moved back to the runnable thread pool
 *  	5. Terminated: When thread finishes its execution
 *  
 * Creating a thread:
 * 		1. You can either extend the Thread class and override its run() method to define the thread's task 
 * 		2. Or implement the Runnable interface and pass an instance of the class to the Thread constructor
 * 
 * The start() method is then called to begin the execution of the thread, which runs concurrently 
 * with other threads in the JVM, enabling multithreading capabilities.
 *
 * Types of threads: User threads and Daemon threads
 * User threads are created by the application and continue to run until their task is completed or the application terminates. 
 * Daemon threads are background threads that are automatically terminated when there are no more user threads running. 
 * These daemon threads are useful for tasks like garbage collection, etc.
 * 
 * Benefits of Multithreading:
 * 1. Time saving as multiple operations are performed concurrently
 * 2. Since threads are independent, other threads don't get affected even if an exception occurs in a single thread
 * 3. Increased throughput
 * 4. Increased responsiveness
 * 
 */
// Way 1: By extending Thread class
class Task1 extends Thread {
	public void run() {
		System.out.println("\nTask 1 Started ...\n");
		
		for (int i=101; i<=199; i++) { 
			System.out.println(i + " ");
		}
		
		System.out.println("\nTask 1 finished ...\n");
	}
}

// Way 2: By implementing Runnable
class Task2 implements Runnable	{

	@Override
	public void run() {
		System.out.println("\nTask 2 Started ...\n");
		
		for (int i=201; i<=299; i++) { 
			System.out.println(i + " ");
		}
		
		System.out.println("\nTask 2 finished ...\n");
	}
	
}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		
		// Task1
		Task1 task1 = new Task1();
		task1.setPriority(1); // it's a request and not a guarantee. It may or may not be honoured.
		
		task1.start(); // NOT task1.run()
		
		// Task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10); // it's a request and not a guarantee. It may or may not be honoured.
		task2Thread.start();
		
		task1.join(); // wait for task1 to complete
		task2Thread.join(); // wait for task2 to complete
		
		// Task 3 starts execution only after task1 and task2 are complete (because of join() above)
		// Task3
		System.out.println("\nTask 3 Started ...\n");
		
		for (int i=301; i<=399; i++) { 
			System.out.println(i + " ");
		}
		
		System.out.println("\nTask 3 finished ...\n");
		System.out.println("\nMain finished ...\n");
	}

}

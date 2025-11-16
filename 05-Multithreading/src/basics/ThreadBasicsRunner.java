package basics;

/***
 * 
 * Multitasking means that computers execute multiple programs (AKA tasks or processes) at the same time.
 * It isn't really "at the same time" though. The single CPU is shared between the programs. The operating system would switch between the programs running, executing each of them for a little while before switching.
 *  
 *  Multithreading is a special form of multitasking where a program is divided into smaller units called threads, which run independently but share the same memory space.
 *
 *  In simple terms:
 * - A process is like an entire program (e.g., Microsoft Word, a Java application).
 * - A thread is like a worker inside that program doing a specific task (e.g., spell checking, autosaving, responding to user input).
 *
 * Real world examples of multithreading:
 * 1. Web browsers: Download something in the background while you continue to browse other pages.
 * 2. Word processor: Typing, spell checking, and autosaving can all happen simultaneously.
 * 3. IDEs: Compiling code in the background while you continue to write code.
 * 4. Servers: Handling multiple client requests at the same time.
 *
 *  Lifecycle of a thread:
 *  	1. New: When a thread is newly created but not yet started using the start() method.
 *  	2. Runnable: After start(), thread is in Runnable state. It does not mean the thread is running immediately — only that it’s eligible to run. It is the responsibility of OS or thread scheduler to run this thread instantly or keep it in the runnable thread pool
 *  	3. Running: After run(), thread scheduler picks one of the threads from the runnable thread pool and starts its execution
 *  	4. Non runnable (Blocked/Waiting/Timed waiting): When a thread is alive and waiting for some resources, it is said to be in Non runnable state. Once the wait is over the thread is moved back to the runnable thread pool
 *  	5. Terminated: When thread finishes its execution
 *
 * Creating a thread:
 * At the core, every thread in Java needs a piece of code to execute — defined in the run() method.
 * To run that code concurrently, you need to create a Thread object and call its start() method.
 * There are two primary ways to create a thread in Java:
 * 		1. Extend the Thread class and override its run() method to define the thread's task
 * 			Pros: It's straightforward and easy to implement for simple tasks.
 * 			Cons: Since Java supports only single inheritance, if your class extends Thread, it cannot extend any other class.
 *
 * 		2. Implement the Runnable interface and pass an instance of the class to the Thread constructor. Runnable is a functional interface with a single run() method
 * 			Pros: Java supports single inheritance, so by implementing Runnable, your class can still extend another class if needed.
 * 			Cons: Slightly more verbose than extending Thread, as you need to create a Thread object separately.
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

	@Override
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

		Task1 task1 = new Task1();
		task1.setPriority(1); // it's a request and not a guarantee. It may or may not be honoured.

		task1.start(); // NOT task1.run(). When start() is called, the JVM internally invokes the run() method. You should never call run() directly because it won’t create a new thread — it will just execute in the current thread.

		Thread task2 = new Thread(new Task2());
		task2.setPriority(10); // it's a request and not a guarantee. It may or may not be honoured.
		task2.start();
		
		task1.join(); // wait for task1 to complete
		task2.join(); // wait for task2 to complete

		 // Another way: Use of lambda expression
		 // Since Runnable is a functional interface, you can use a lambda expression to create a thread in a more concise way.
//		 Thread task2 = new Thread(() -> {
//			 System.out.println("\nTask 2 Started ...\n");
//
//			 for (int i = 201; i <= 299; i++) {
//				 System.out.println(i + " ");
//			 }
//
//			 System.out.println("\nTask 2 finished ...\n");
//		 });
//		 task2.start();

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
